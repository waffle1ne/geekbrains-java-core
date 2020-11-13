package ru.geekbrains.homework11.homework;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor

@DbTable(tableName = "user")
public class User {

	@DbId
	private Long id;

	@DbColumn(columnName = "user_name")
	private String username;

	@DbColumn(columnName = "password")
	private String password;
}
