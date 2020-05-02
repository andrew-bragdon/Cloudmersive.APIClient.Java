/*
 * convertapi
 * Convert API lets you effortlessly convert file formats and types.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.cloudmersive.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.cloudmersive.client.model.DocxComment;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * Top-level Comment in a Word Document
 */
@ApiModel(description = "Top-level Comment in a Word Document")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-01T18:06:22.664-07:00")
public class DocxTopLevelComment {
  @SerializedName("Path")
  private String path = null;

  @SerializedName("Author")
  private String author = null;

  @SerializedName("AuthorInitials")
  private String authorInitials = null;

  @SerializedName("CommentText")
  private String commentText = null;

  @SerializedName("CommentDate")
  private OffsetDateTime commentDate = null;

  @SerializedName("ReplyChildComments")
  private List<DocxComment> replyChildComments = null;

  @SerializedName("Done")
  private Boolean done = null;

  public DocxTopLevelComment path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Path to the comment in the document
   * @return path
  **/
  @ApiModelProperty(value = "Path to the comment in the document")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public DocxTopLevelComment author(String author) {
    this.author = author;
    return this;
  }

   /**
   * Author name of the comment
   * @return author
  **/
  @ApiModelProperty(value = "Author name of the comment")
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public DocxTopLevelComment authorInitials(String authorInitials) {
    this.authorInitials = authorInitials;
    return this;
  }

   /**
   * Initials of the author of the comment
   * @return authorInitials
  **/
  @ApiModelProperty(value = "Initials of the author of the comment")
  public String getAuthorInitials() {
    return authorInitials;
  }

  public void setAuthorInitials(String authorInitials) {
    this.authorInitials = authorInitials;
  }

  public DocxTopLevelComment commentText(String commentText) {
    this.commentText = commentText;
    return this;
  }

   /**
   * Text content of the comment
   * @return commentText
  **/
  @ApiModelProperty(value = "Text content of the comment")
  public String getCommentText() {
    return commentText;
  }

  public void setCommentText(String commentText) {
    this.commentText = commentText;
  }

  public DocxTopLevelComment commentDate(OffsetDateTime commentDate) {
    this.commentDate = commentDate;
    return this;
  }

   /**
   * Date timestamp of the comment
   * @return commentDate
  **/
  @ApiModelProperty(value = "Date timestamp of the comment")
  public OffsetDateTime getCommentDate() {
    return commentDate;
  }

  public void setCommentDate(OffsetDateTime commentDate) {
    this.commentDate = commentDate;
  }

  public DocxTopLevelComment replyChildComments(List<DocxComment> replyChildComments) {
    this.replyChildComments = replyChildComments;
    return this;
  }

  public DocxTopLevelComment addReplyChildCommentsItem(DocxComment replyChildCommentsItem) {
    if (this.replyChildComments == null) {
      this.replyChildComments = new ArrayList<DocxComment>();
    }
    this.replyChildComments.add(replyChildCommentsItem);
    return this;
  }

   /**
   * Child comments, that are replies to this one
   * @return replyChildComments
  **/
  @ApiModelProperty(value = "Child comments, that are replies to this one")
  public List<DocxComment> getReplyChildComments() {
    return replyChildComments;
  }

  public void setReplyChildComments(List<DocxComment> replyChildComments) {
    this.replyChildComments = replyChildComments;
  }

  public DocxTopLevelComment done(Boolean done) {
    this.done = done;
    return this;
  }

   /**
   * True if this comment is marked as Done in Word, otherwise it is false
   * @return done
  **/
  @ApiModelProperty(value = "True if this comment is marked as Done in Word, otherwise it is false")
  public Boolean isDone() {
    return done;
  }

  public void setDone(Boolean done) {
    this.done = done;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxTopLevelComment docxTopLevelComment = (DocxTopLevelComment) o;
    return Objects.equals(this.path, docxTopLevelComment.path) &&
        Objects.equals(this.author, docxTopLevelComment.author) &&
        Objects.equals(this.authorInitials, docxTopLevelComment.authorInitials) &&
        Objects.equals(this.commentText, docxTopLevelComment.commentText) &&
        Objects.equals(this.commentDate, docxTopLevelComment.commentDate) &&
        Objects.equals(this.replyChildComments, docxTopLevelComment.replyChildComments) &&
        Objects.equals(this.done, docxTopLevelComment.done);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, author, authorInitials, commentText, commentDate, replyChildComments, done);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxTopLevelComment {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    authorInitials: ").append(toIndentedString(authorInitials)).append("\n");
    sb.append("    commentText: ").append(toIndentedString(commentText)).append("\n");
    sb.append("    commentDate: ").append(toIndentedString(commentDate)).append("\n");
    sb.append("    replyChildComments: ").append(toIndentedString(replyChildComments)).append("\n");
    sb.append("    done: ").append(toIndentedString(done)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

