package com.swiftnote.swiftNote.repository;

import com.swiftnote.swiftNote.entity.JournalEntry;
import com.swiftnote.swiftNote.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {

    User findByUserName(String username);

}
