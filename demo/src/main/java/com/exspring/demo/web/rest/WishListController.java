package com.exspring.demo.web.rest;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.exspring.demo.builder.WishListBuilder;
import com.exspring.demo.entity.WishList;
import com.exspring.demo.repository.CommonRepository;
import com.exspring.demo.web.validation.ValidationError;
import com.exspring.demo.web.validation.ValidationErrorBuilder;

@RestController
@RequestMapping("/api")
public class WishListController {

	private CommonRepository<WishList> repository;

	@Autowired
	public WishListController(CommonRepository<WishList> repository) {
		this.repository = repository;
	}

	@GetMapping("/wishList")
	public ResponseEntity<Iterable<WishList>> getWishList() {
		return ResponseEntity.ok(repository.findAll());
	}

	@GetMapping("/wishList/{id}")
	public ResponseEntity<WishList> getWishListById(@PathVariable String id) {
		return ResponseEntity.ok(repository.findById(id));
	}

	@PatchMapping("/wishList/{id}")
	public ResponseEntity<WishList> setShorDesc(@PathVariable String id) {
		WishList wishList = repository.findById(id);
		wishList.setShortDesc("true");
		repository.save(wishList);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().buildAndExpand(wishList.getId()).toUri();
		return ResponseEntity.ok().header("Location", location.toString()).build();
	}

	@RequestMapping(value = "/wishList", method = { RequestMethod.POST, RequestMethod.PUT })
	public ResponseEntity<?> createWishList(@Valid @RequestBody WishList wishList, Errors errors) {
		if (errors.hasErrors()) {
			return ResponseEntity.badRequest().body(ValidationErrorBuilder.fromBindingErrors(errors));
		}
		WishList sWishList = repository.save(wishList);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(sWishList.getId()).toUri();
		return ResponseEntity.created(location).build();
	}

	@DeleteMapping("/wishList/{id}")
	public ResponseEntity<WishList> deleteWishList(@PathVariable String id) {
		repository.delete(WishListBuilder.create().withId(id).build());
		return ResponseEntity.noContent().build();
	}

	@DeleteMapping("/wishList")
	public ResponseEntity<WishList> deleteWishList(@RequestBody WishList wishList) {
		repository.delete(wishList);
		return ResponseEntity.noContent().build();
	}

	@ExceptionHandler
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	public ValidationError handleException(Exception exception) {
		return new ValidationError(exception.getMessage());
	}
}
