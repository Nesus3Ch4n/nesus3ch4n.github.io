/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author jesus
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
