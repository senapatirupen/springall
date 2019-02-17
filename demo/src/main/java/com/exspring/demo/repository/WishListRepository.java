package com.exspring.demo.repository;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.exspring.demo.entity.WishList;
@Repository
public class WishListRepository implements CommonRepository<WishList> {

	private Map<String, WishList> wishLists = new HashMap<>();

	@Override
	public WishList save(WishList entity) {
		WishList wishList = wishLists.get(entity.getId());
		if (wishList != null) {
			wishList.setModifiedDate(LocalDateTime.now());
			wishList.setShortDesc(entity.getShortDesc());
			entity = wishList;
		}
		wishLists.put(entity.getId(), entity);
		return wishLists.get(entity.getId());
	}

	@Override
	public Iterable<WishList> save(Collection<WishList> entity) {
		entity.forEach(this::save);
		return findAll();
	}

	@Override
	public void delete(WishList entity) {
		wishLists.remove(entity.getId());
	}

	@Override
	public WishList findById(String id) {
		return wishLists.get(id);
	}

	@Override
	public Iterable<WishList> findAll() {
		return wishLists.entrySet().stream().sorted(entryComparator).map(Map.Entry::getValue)
				.collect(Collectors.toList());
	}

	private Comparator<Map.Entry<String, WishList>> entryComparator = (Map.Entry<String, WishList> o1,
			Map.Entry<String, WishList> o2) -> {
		return o1.getValue().getCreatedDate().compareTo(o2.getValue().getCreatedDate());
	};

}
