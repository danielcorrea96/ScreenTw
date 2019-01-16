
Feature: Post Tweet in a user profile
	I as a Twitter user
	I want to be able to post a tweet in a user profile
	To invite you to a test automation course.
	
	Background: Access the social network Twitter
	Given that you access the Twitter page and enter the credentials of 'danielcorrea1058@gmail.com' and 'danielcorrea1996'
	
	@tag
	Scenario: Tweet in my profile.
	When you proceed to make a tweet 'Esto es una prueba Automatica'
	Then you should see the tweet in the profile 'Esto es una prueba Automatica'
	
	
