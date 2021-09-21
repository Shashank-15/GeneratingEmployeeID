package com.example.GenratingIdStandard;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Model")
public class Model {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "emp_id")
    @GenericGenerator(name = "emp_id",strategy ="com.example.GenratingIdStandard.StringPrefixedSequenceIdGenerator",
            parameters = {
            @Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM,value = "1"),
            @Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER,value = "Employee_"),
            @Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER,value = "%05d")})

//    @GenericGenerator(name = "emp_id", strategy = "com.example.GenratingIdStandard.StringPrefixedSequenceIdGenerator")
//    @GeneratedValue(generator = "emp_id")

    @Column(name = "id",updatable = false,nullable = false)
    public String Id;

    @Getter @Setter
    @Column(name = "employee_name")
    public  String employeeName;

}
