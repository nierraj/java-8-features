package com.features.stream.examples;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

public class ReverseWordInString {

	public static void main(String[] args) {
		reverseWordsInString("Welcome to java's Stream and Lambda");
	}

	public static void reverseWordsInString(String str) {
		String words[] = str.split(" ");
		StringBuilder sb = new StringBuilder();
		Stream<String> stream = Arrays.stream(words);

		stream.forEach(w -> {
			Function<String, String> reverse = s -> new StringBuilder(s).reverse().toString();
			String reversedWord = reverse.apply(w);
			sb.append(reversedWord + " ");
		});

		System.out.println("Original String: " + str);
		System.out.println("Reversed String: " + sb);
	}

}