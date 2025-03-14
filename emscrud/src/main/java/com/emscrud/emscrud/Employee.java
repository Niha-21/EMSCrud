package com.emscrud.emscrud;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    
    String id;
    String name;
    String email;
    String address;

}
