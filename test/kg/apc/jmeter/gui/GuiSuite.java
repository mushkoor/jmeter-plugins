/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kg.apc.jmeter.gui;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author undera
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({BrowseActionTest.class, DialogFactoryTest.class, CopyRowActionTest.class, AddRowActionTest.class, GuiBuilderHelperTest.class, JAbsrtactDialogPanelTest.class, DeleteRowActionTest.class, ComponentBorderTest.class, CustomNumberRendererTest.class, ButtonPanelAddCopyRemoveTest.class})
public class GuiSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

}