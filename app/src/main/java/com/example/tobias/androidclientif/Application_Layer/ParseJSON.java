package com.example.tobias.androidclientif.Application_Layer;

import com.example.tobias.androidclientif.Entities.Assignment;
import com.example.tobias.androidclientif.Entities.Task;
import com.example.tobias.androidclientif.Entities.User;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

/**
 * Created by Tobias on 19.01.15.
 */
public class ParseJSON {

    //Method: Parse User to JSON
    public String userToJson(User user){
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("id", user.getUserId());
            jsonObject.put("userName", user.getUserName());
            jsonObject.put("emailAddress", user.getEmail());
            jsonObject.put("role", user.getRole());
            jsonObject.put("firstName", user.getFirstName());
            jsonObject.put("lastName", user.getLastName());
            jsonObject.put("phoneNumber", user.getPhoneNumber());
            jsonObject.put("mobileNumber", user.getMobileNumber());
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return jsonObject.toString();
    }

    public String taskToJson (Task task){
        JSONObject jsonObject = new JSONObject();

        try {
            jsonObject.put("id", task.getId());
            jsonObject.put("taskName", task.getTaskName());
            jsonObject.put("description", task.getDescription());
            jsonObject.put("state", task.getState());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonObject.toString();
    }

    public String assignmentToJson(Assignment assignment){
        JSONObject jsonObject = new JSONObject();

        try {
            jsonObject.put("id", assignment.getId());
            jsonObject.put("assignmentName", assignment.getAssignmentName());
            jsonObject.put("description", assignment.getDescription());
            jsonObject.put("isTemplate", assignment.getIsTemplate());
            jsonObject.put("tasks", null);
            jsonObject.put("startDate", assignment.getStartDate());
            jsonObject.put("endDate", assignment.getDueDate());
            jsonObject.put("attachmentIds", null);
            jsonObject.put("user",null);
            jsonObject.put("inspectionObject", null);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return jsonObject.toString();
    }
}
