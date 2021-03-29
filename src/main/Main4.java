package main;

import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

import movie.Movie;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileReader file=new FileReader("many_movies.json")){
			Gson gson=new Gson();
			
			//Movie[] movies=gson.fromJson(file, Movie[].class);
			//List<Movie> movies=Arrays.asList(gson.fromJson(file, Movie[].class));
			Type typeToken=new TypeToken<LinkedList<Movie>>(){}.getType();
			List<Movie> movies=gson.fromJson(file, typeToken);
			
			for(Movie m: movies) {
				System.out.println(m);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
