package com.csu.dao;

import java.util.List;

import com.csu.entity.PatientTopic;
import com.csu.entity.Topic;
import com.csu.entity.TopicScale;

public interface TopicDAO {
	
	public boolean addTopic(Topic topic);
	
	public boolean deleteTopic(Topic topic);
	
	public boolean updateTopic(Topic topic);
	
	public List<Topic> QueryTopic();
	
	public boolean addTopicScale(TopicScale ts);
	
	public boolean deleteTopicScale(TopicScale ts);
	
	public boolean updateTopicScale(TopicScale ts);
	
	public List<TopicScale> QueryTopicScale();
	
	public boolean addTopicPatient(PatientTopic pt);
	
	public boolean deleteTopicPatient(PatientTopic pt);
	
	public boolean updateTopicPatient(PatientTopic pt);
	
	public List<PatientTopic> queryTopicPatient();
}
