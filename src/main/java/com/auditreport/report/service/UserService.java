package com.auditreport.report.service;

import com.auditreport.report.model.UserModel;
import com.auditreport.report.repository.AuditRepository;
import com.auditreport.report.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    // get all users
    public List<UserModel> getAllUsers() {
        List<UserModel> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    // get user with id
    public UserModel getUser(Long id){
        Optional<UserModel> optionalUserModel = userRepository.findById(id);
        if(optionalUserModel.isPresent()) {
            return optionalUserModel.get();
        }else {
            return null;
        }
    }

    // add a user
    public  UserModel addUser(UserModel userModel){
        return userRepository.save(userModel);
    }

    // upaate a user
//    public UserModel updateUser(long id, UserModel userModel){
//        Optional<UserModel> existingUserOptional = userRepository.findById(id);
//        if(existingUserOptional.isPresent()){
//            //update exisint user with new data
//            existingUserOptional.
//        }
//    }

    public void deleteUser(UserModel id){
        userRepository.delete(id);
    }


    }

