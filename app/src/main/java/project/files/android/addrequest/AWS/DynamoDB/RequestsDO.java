package project.files.android.addrequest.AWS.DynamoDB;

import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBAttribute;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBHashKey;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBTable;

@DynamoDBTable(tableName = "addrequest-mobilehub-1269242402-Requests")

public class RequestsDO {
    private Double _id;
    private String _userID;
    private String _date;
    private String _description;
    private String _title;

    @DynamoDBHashKey(attributeName = "id")
    @DynamoDBAttribute(attributeName = "id")
    public Double getId() {
        return _id;
    }
    public void setId(final Double _id) {
        this._id = _id;
    }

    @DynamoDBAttribute(attributeName = "userID")
    public String getUserID() {
        return _userID;
    }
    public void setUserID(final String _userID) {
        this._userID = _userID;
    }

    @DynamoDBAttribute(attributeName = "date")
    public String getDate() {
        return _date;
    }
    public void setDate(final String _date) {
        this._date = _date;
    }

    @DynamoDBAttribute(attributeName = "description")
    public String getDescription() {
        return _description;
    }
    public void setDescription(final String _description) {
        this._description = _description;
    }

    @DynamoDBAttribute(attributeName = "title")
    public String getTitle() {
        return _title;
    }
    public void setTitle(final String _title) {
        this._title = _title;
    }

}