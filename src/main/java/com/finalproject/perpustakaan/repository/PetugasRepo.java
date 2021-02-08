package com.finalproject.perpustakaan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finalproject.perpustakaan.model.Petugas;

public interface PetugasRepo extends JpaRepository<Petugas, Integer>{
	public Petugas findByNamaIgnoreCase(String nama);
}
