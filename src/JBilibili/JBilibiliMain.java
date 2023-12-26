package JBilibili;

import javax.microedition.midlet.*;

import com.sun.lwuit.*;
import com.sun.lwuit.animations.Transition;
import com.sun.lwuit.events.ActionEvent;
import com.sun.lwuit.events.ActionListener;
import com.sun.lwuit.events.FocusListener;
import com.sun.lwuit.geom.Dimension;
import com.sun.lwuit.layouts.BorderLayout;
import com.sun.lwuit.layouts.BoxLayout;
import com.sun.lwuit.layouts.GridLayout;
import com.sun.lwuit.plaf.Style;
import com.sun.lwuit.plaf.UIManager;
import com.sun.lwuit.util.Resources;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;
import javax.microedition.io.Connector;
import javax.microedition.io.InputConnection;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;


public class JBilibiliMain extends MIDlet implements ActionListener{

    public JBilibiliMain(){
        Display.init(this);
        Form myForm = new Form("JBilibili");
        myForm.setScrollable(false);
        TabbedPane tp = new TabbedPane();
        final TextField content = new TextField("");
        final TextField content1 = new TextField("");
        final TextField content2 = new TextField("");
        final TextField content3 = new TextField("");
        tp.addTab("搜索",content);
        tp.addTab("热门",content1);
        tp.addTab("直播",content2);
        tp.addTab("分区",content3);
        myForm.addComponent(tp);
        Command exitCommand = new Command("Exit", 1);

        myForm.addCommand(exitCommand);
        myForm.setCommandListener(this);
        myForm.show();
    }

    public void startApp() {
    }

    public void pauseApp() {
    }

    public void destroyApp(boolean unconditional) {
    }

    public void actionPerformed(ActionEvent evt) {
        Command cmd = evt.getCommand();
        //switch (cmd.getId()) {
        //}
        notifyDestroyed();
    }

}
