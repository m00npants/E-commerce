package org.example.ecommerce.repository;

import org.example.ecommerce.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {

    Optional<UserProfile> findByNickname(String nickname);

    List<UserProfile> findByPhoneNumberContaining(String partial);

    List<UserProfile> findByBioIsNotNull();

    List<UserProfile> findByNicknameStartingWithIgnoreCase(String prefix);

    long countByPhoneNumberStartingWith(String prefix);
}