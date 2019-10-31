package demo.jsf.joinfaces.database.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demo.jsf.joinfaces.database.model.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {

}
