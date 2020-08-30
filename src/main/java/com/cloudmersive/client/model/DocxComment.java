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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * Comment in a Word Document
 */
@ApiModel(description = "Comment in a Word Document")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-30T16:05:35.571-07:00")
public class DocxComment {
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

  @SerializedName("IsTopLevel")
  private Boolean isTopLevel = null;

  @SerializedName("IsReply")
  private Boolean isReply = null;

  @SerializedName("ParentCommentPath")
  private String parentCommentPath = null;

  @SerializedName("Done")
  private Boolean done = null;

  public DocxComment path(String path) {
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

  public DocxComment author(String author) {
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

  public DocxComment authorInitials(String authorInitials) {
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

  public DocxComment commentText(String commentText) {
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

  public DocxComment commentDate(OffsetDateTime commentDate) {
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

  public DocxComment isTopLevel(Boolean isTopLevel) {
    this.isTopLevel = isTopLevel;
    return this;
  }

   /**
   * True if the comment is at the top level, false if this comment is a child reply of another comment
   * @return isTopLevel
  **/
  @ApiModelProperty(value = "True if the comment is at the top level, false if this comment is a child reply of another comment")
  public Boolean isIsTopLevel() {
    return isTopLevel;
  }

  public void setIsTopLevel(Boolean isTopLevel) {
    this.isTopLevel = isTopLevel;
  }

  public DocxComment isReply(Boolean isReply) {
    this.isReply = isReply;
    return this;
  }

   /**
   * True if this comment is a reply to another comment, false otherwise
   * @return isReply
  **/
  @ApiModelProperty(value = "True if this comment is a reply to another comment, false otherwise")
  public Boolean isIsReply() {
    return isReply;
  }

  public void setIsReply(Boolean isReply) {
    this.isReply = isReply;
  }

  public DocxComment parentCommentPath(String parentCommentPath) {
    this.parentCommentPath = parentCommentPath;
    return this;
  }

   /**
   * Path to the parent of this comment, if this comment is a reply, otherwise this value will be null
   * @return parentCommentPath
  **/
  @ApiModelProperty(value = "Path to the parent of this comment, if this comment is a reply, otherwise this value will be null")
  public String getParentCommentPath() {
    return parentCommentPath;
  }

  public void setParentCommentPath(String parentCommentPath) {
    this.parentCommentPath = parentCommentPath;
  }

  public DocxComment done(Boolean done) {
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
    DocxComment docxComment = (DocxComment) o;
    return Objects.equals(this.path, docxComment.path) &&
        Objects.equals(this.author, docxComment.author) &&
        Objects.equals(this.authorInitials, docxComment.authorInitials) &&
        Objects.equals(this.commentText, docxComment.commentText) &&
        Objects.equals(this.commentDate, docxComment.commentDate) &&
        Objects.equals(this.isTopLevel, docxComment.isTopLevel) &&
        Objects.equals(this.isReply, docxComment.isReply) &&
        Objects.equals(this.parentCommentPath, docxComment.parentCommentPath) &&
        Objects.equals(this.done, docxComment.done);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, author, authorInitials, commentText, commentDate, isTopLevel, isReply, parentCommentPath, done);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxComment {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    authorInitials: ").append(toIndentedString(authorInitials)).append("\n");
    sb.append("    commentText: ").append(toIndentedString(commentText)).append("\n");
    sb.append("    commentDate: ").append(toIndentedString(commentDate)).append("\n");
    sb.append("    isTopLevel: ").append(toIndentedString(isTopLevel)).append("\n");
    sb.append("    isReply: ").append(toIndentedString(isReply)).append("\n");
    sb.append("    parentCommentPath: ").append(toIndentedString(parentCommentPath)).append("\n");
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

