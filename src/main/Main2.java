package main;

import java.io.FileReader;
import movie.Movie;
import com.google.gson.Gson;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (FileReader file = new FileReader("movie.json")){
			Gson gson = new Gson();
			Movie m=gson.fromJson(file, Movie.class);
			System.out.println(m);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
