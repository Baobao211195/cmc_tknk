package com.tkhq.cmc.controller.rest;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.tkhq.cmc.model.Tbs_Mahs_dkgh;
import com.tkhq.cmc.services.Tbs_Mahs_dkghService;;
 
@RestController
public class Tbs_Mahs_dkghRestController {
 
    @Autowired
    Tbs_Mahs_dkghService tbs_Mahs_dkghService;  //Service which will do all data retrieval/manipulation work
 
    
    //-------------------Retrieve All Users--------------------------------------------------------
     
    @RequestMapping(value = "/tbs_mahs_dkgh/", method = RequestMethod.GET)
    public ResponseEntity<List<Tbs_Mahs_dkgh>> listAllUsers() {
        List<Tbs_Mahs_dkgh> lstTbs_Mahs_dkgh = tbs_Mahs_dkghService.findAll();
        if(lstTbs_Mahs_dkgh.isEmpty()){
            return new ResponseEntity<List<Tbs_Mahs_dkgh>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Tbs_Mahs_dkgh>>(lstTbs_Mahs_dkgh, HttpStatus.OK);
    }
 
 
    
//    //-------------------Retrieve Single User--------------------------------------------------------
//     
//    @RequestMapping(value = "/tbs_mahs_dkgh/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<User> getUser(@PathVariable("id") long id) {
//        System.out.println("Fetching User with id " + id);
//        User user = userService.findById(id);
//        if (user == null) {
//            System.out.println("User with id " + id + " not found");
//            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
//        }
//        return new ResponseEntity<User>(user, HttpStatus.OK);
//    }
// 
//     
//     
//    //-------------------Create a User--------------------------------------------------------
//     
    @RequestMapping(value = "/tbs_mahs_dkgh/", method = RequestMethod.POST)
    public ResponseEntity<Void> createUser(@RequestBody Tbs_Mahs_dkgh user,    UriComponentsBuilder ucBuilder) {
        /*System.out.println("Creating User " + user.getUsername());*/
 
        if (tbs_Mahs_dkghService.findById(user.getSTT()) != null) {
            /*System.out.println("A User with name " + user.getUsername() + " already exist");*/
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
 
        try {
			tbs_Mahs_dkghService.insertTbs_Mahs_dkgh(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
        HttpHeaders headers = new HttpHeaders();
//        headers.setLocation(ucBuilder.path("/tbs_cuakhaunn_vnaccs/{maCang}").buildAndExpand(entity.getMaCang()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
// 
//    
//     
//    //------------------- Update a User --------------------------------------------------------
//     
    @RequestMapping(value = "/tbs_mahs_dkgh/{stt}", method = RequestMethod.PUT)
    public ResponseEntity<Tbs_Mahs_dkgh> updateUser(@PathVariable("stt") long stt, @RequestBody Tbs_Mahs_dkgh user) {
        System.out.println("Updating User " + stt);
         
        Tbs_Mahs_dkgh currenttbs_Mahs_dkgh = tbs_Mahs_dkghService.findById(stt);
         
        if (currenttbs_Mahs_dkgh==null) {
            System.out.println("User with id " + stt + " not found");
            return new ResponseEntity<Tbs_Mahs_dkgh>(HttpStatus.NOT_FOUND);
        }
 
//        currentUser.setUsername(user.getUsername());
//        currentUser.setAddress(user.getAddress());
//        currentUser.setEmail(user.getEmail());
        currenttbs_Mahs_dkgh.setTEN_PTVT(user.getTEN_PTVT());
         
        tbs_Mahs_dkghService.updateTbs_Mahs_dkgh(currenttbs_Mahs_dkgh);
        return new ResponseEntity<Tbs_Mahs_dkgh>(currenttbs_Mahs_dkgh, HttpStatus.OK);
    }
// 
//    
//    
//    //------------------- Delete a User --------------------------------------------------------
//     
//    @RequestMapping(value = "/tbs_mahs_dkgh/{id}", method = RequestMethod.DELETE)
//    public ResponseEntity<User> deleteUser(@PathVariable("id") long id) {
//        System.out.println("Fetching & Deleting User with id " + id);
// 
//        User user = userService.findById(id);
//        if (user == null) {
//            System.out.println("Unable to delete. User with id " + id + " not found");
//            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
//        }
// 
//        userService.deleteUserById(id);
//        return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
//    }
// 
//     
//    
//    //------------------- Delete All Users --------------------------------------------------------
//     
//    @RequestMapping(value = "/user/", method = RequestMethod.DELETE)
//    public ResponseEntity<User> deleteAllUsers() {
//        System.out.println("Deleting All Users");
// 
//        userService.deleteAllUsers();
//        return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
//    }
 
}