package opp.inheritance;
import oop.inheritance.Main;

import oop.inheritance.Application;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MainTest {

    @Test
    public void when1IsTyped_thenShowConfigurationIsCalled(){
        //given
        Application application = Mockito.mock(Application.class);
        Mockito.when(application.readKey()).thenReturn("1");
        //when
        Main.run(application);
        //then
        Mockito.verify(application).clearScreen();
        Mockito.verify(application).showMenu();
        Mockito.verify(application).readKey();
        Mockito.verify(application).doSale();

        Mockito.verifyNoMoreInteractions(application);
    }
    @Test
    public void when2IsTyped_thenShowConfigurationIsCalled(){
        //given
        Application application = Mockito.mock(Application.class);
        Mockito.when(application.readKey()).thenReturn("2");
        //when
        Main.run(application);
        //then
        Mockito.verify(application).clearScreen();
        Mockito.verify(application).showMenu();
        Mockito.verify(application).readKey();
        Mockito.verify(application).doRefund();

        Mockito.verifyNoMoreInteractions(application);
    }
    @Test
    public void when3IsTyped_thenShowConfigurationIsCalled(){
        //given
        Application application = Mockito.mock(Application.class);
        Mockito.when(application.readKey()).thenReturn("3");
        //when
        Main.run(application);
        //then
        Mockito.verify(application).clearScreen();
        Mockito.verify(application).showMenu();
        Mockito.verify(application).readKey();
        Mockito.verify(application).printReport();

        Mockito.verifyNoMoreInteractions(application);
    }
    @Test
    public void when4IsTyped_thenShowConfigurationIsCalled(){
        //given
        Application application = Mockito.mock(Application.class);
        Mockito.when(application.readKey()).thenReturn("4");
        //when
        Main.run(application);
        //then
        Mockito.verify(application).clearScreen();
        Mockito.verify(application).showMenu();
        Mockito.verify(application).readKey();
        Mockito.verify(application).showConfiguration();

        Mockito.verifyNoMoreInteractions(application);
    }

}
