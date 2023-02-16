package com.bngferoz.sqlaudit.config;
import org.javers.spring.auditable.AuthorProvider;
import org.springframework.context.annotation.Bean;

public class JaversConfiguration {

	private static final String AUTHOR = "current author";
	
	@Bean
	public AuthorProvider provideJaversAuthor() {
	        return new SimpleAuthorProvider();
	}
	private static class SimpleAuthorProvider implements AuthorProvider {
		@Override
		public String provide() {
		            return AUTHOR;
		   }
		}
}
