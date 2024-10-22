//package com.swiftnote.swiftNote.controller;
//
//import com.swiftnote.swiftNote.entity.JournalEntry;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//
///* Methods inside a controller class should be public so that they can be accessed and invoked
//   by the spring framework or external http requests.
// */
//
//@RestController
//@RequestMapping("/_journal")
//public class JournalEntryController {
//
//    private Map<Long, JournalEntry> journalEntries = new HashMap<>();
//
//    @GetMapping()
//    public List<JournalEntry> getAll() {    // localhost:8080/journal  GET
//        return new ArrayList<>(journalEntries.values());
//    }
//
//    @PostMapping
//    public boolean createEntry(@RequestBody JournalEntry myEntry) {     // localhost:8080/journal  POST
//        journalEntries.put(myEntry.getId(), myEntry);
//        return true;
//    }
//
//    /* @RequestBody -> Takes the data from the request and turns it into a java object
//       that can be used in the code
//     */
//
//    @GetMapping("id/{myId}")
//    public JournalEntry getJournalEntryById(@PathVariable String myId) {
//        return journalEntries.get(myId);
//    }
//
//    @DeleteMapping("id/{myId}")
//    public JournalEntry deleteJournalById(@PathVariable String myId) {
//        return journalEntries.remove(myId);
//    }
//
//    @PutMapping("/id/{id}")
//    public JournalEntry updateJournalById(@PathVariable String id, @RequestBody JournalEntry myEntry) {
//        return journalEntries.put(id, myEntry);
//    }
//
//}
//
//
