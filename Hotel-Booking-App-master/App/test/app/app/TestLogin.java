package app;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.*;


public class TestLogin {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void mainLoginFill() {
        System.out.println("Test [1] Fill Main Login Form");

        /*
            Declare use variable for testing
        */
        Login frame;
        JTextField username;
        JPasswordField password;


        /*
            Constuct Login app, get attribute, set text and get output value.
            Check whether the input is equal to the output.
            1. Get the names of each component
            2. Test input and output
        */
        frame = new Login();
        frame.setVisible(true);

        username = (JTextField) TestUtil.getChildNamed(frame, "jTextField1");
        password = (JPasswordField) TestUtil.getChildNamed(frame, "jPasswordField1");

        System.out.println("JUnit found TextField and PassowrdField on Java Swing Form");

        assertNotNull("Can't access the JTextField component",username);
        assertNotNull("Can't access the JPasswordField component",password);

        System.out.println("Put text and get text from field JTextField and JPasswordField");
        username.setText("test");
        password.setText("test");

        assertEquals("test", username.getText());
        assertEquals("test", new String(password.getPassword()));
    }
}
