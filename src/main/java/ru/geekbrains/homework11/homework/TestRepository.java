package ru.geekbrains.homework11.homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.function.Consumer;

public class TestRepository {

	public static void main(String[] args) throws SQLException {
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/vtb_jdbc_lesson?createDatabaseIfNotExist=true&allowPublicKeyRetrieval=true&useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC",
				"root", "root");

		Repository<User> userRepository = new Repository<>(User.class, connection);

//		userRepository.insert(new User(null, "ccc", "ccc"));
//		userRepository.insert(new User(null, "ddd", "ddd"));
//		userRepository.insert(new User(null, "ddb", "ddd"));
//		userRepository.insert(new User(null, "nnn", "nnn"));

		userRepository.findAll().forEach(System.out::println);
	}
}
