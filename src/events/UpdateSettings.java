/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

/**
 *
 * @author amrsa
 */
public class UpdateSettings {
    public static String getStatement() {
        String statement = "select * from UpdateSettings";
        return statement;
    }
}
