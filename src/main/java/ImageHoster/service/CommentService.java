package ImageHoster.service;

import ImageHoster.model.Comment;
import ImageHoster.model.Image;
import ImageHoster.model.User;
import ImageHoster.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    /**
     * Method to add a comment to the image
     *
     * @param commentText
     * @param image
     * @param  user
     */
    public void addComment(String commentText, Image image, User user) {
        Comment comment = new Comment();
        comment.setCreatedDate(LocalDate.now());
        comment.setText(commentText);
        comment.setUser(user);
        comment.setImage(image);
        commentRepository.addComment(comment);
    }

}
