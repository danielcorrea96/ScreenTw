@tag
Feature: Post Tweet in a user profile
	I as a Twitter user
	I want to be able to post a tweet in a user profile
	To invite you to a test automation course.
	
	Background: Access the social network Twitter
	Given that you access the Twitter page and enter the credentials of 'danielcorrea1058' and 'danielcorrea1996'
	
	@tag1
	Scenario: Search the user DN_C96 on Twitter.
	When proceeding to look for the user 'DN_C96'
	Then you should expect to see the name of 'Daniel Correa'
	
	@tag2
  Scenario: Follow user DN_C96	
  When you proceed to follow the user Daniel Correa
  Then you expect to see Following
    
  @tag3  
  Scenario: Tweet in the profile DN_C96		  
   When you proceed to invite Daniel to 'the great marathon of test automation'     
   Then the tweet is expected to be on the list of recent tweets with 'the great marathon of test automation'
  

