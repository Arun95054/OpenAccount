package com.arun.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arun.entity.ResourceDtls;

public interface ResourceDtlsRepository extends JpaRepository<ResourceDtls, Serializable> {

}
