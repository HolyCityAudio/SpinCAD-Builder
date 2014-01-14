/**
 * generated by Xtext
 */
package com.holycityaudio.spincadmenu.generator;

import com.holycityaudio.spincadmenu.spinCADMenu.Element;
import com.holycityaudio.spincadmenu.spinCADMenu.MENU_HEADER;
import com.holycityaudio.spincadmenu.spinCADMenu.MENU_ITEM;
import com.holycityaudio.spincadmenu.spinCADMenu.Menu;
import com.holycityaudio.spincadmenu.spinCADMenu.TEST_ITEM;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
@SuppressWarnings("all")
public class SpinCADMenuGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    String pkage = "\\com\\holycityaudio\\SpinCAD\\";
    String _className = this.className(resource);
    String _plus = (pkage + _className);
    String _plus_1 = (_plus + "Menu");
    String _plus_2 = (_plus_1 + ".java");
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    CharSequence _menuCode = this.toMenuCode(((Menu) _head));
    fsa.generateFile(_plus_2, _menuCode);
  }
  
  public String className(final Resource res) {
    URI _uRI = res.getURI();
    String name = _uRI.lastSegment();
    InputOutput.<String>println(name);
    int _indexOf = name.indexOf(".");
    return name.substring(0, _indexOf);
  }
  
  public CharSequence toTestCases(final Menu mn, final Resource resource, final IFileSystemAccess fsa) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Element> _elements = mn.getElements();
      for(final Element m : _elements) {
        CharSequence _switchResult = null;
        boolean _matched = false;
        if (!_matched) {
          if (m instanceof TEST_ITEM) {
            final TEST_ITEM _tEST_ITEM = (TEST_ITEM)m;
            _matched=true;
            CharSequence _genTestItem = this.genTestItem(_tEST_ITEM, resource, fsa);
            _switchResult = _genTestItem;
          }
        }
        _builder.append(_switchResult, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence genTestItem(final TEST_ITEM m, final Resource resource, final IFileSystemAccess fsa) {
    CharSequence _xblockexpression = null;
    {
      String pkage = "\\com\\holycityaudio\\SpinCAD\\test\\";
      StringConcatenation _builder = new StringConcatenation();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  public Object toTestCode(final Menu mn) {
    return null;
  }
  
  public CharSequence toMenuCode(final Menu mn) {
    CharSequence _xblockexpression = null;
    {
      String menuNameY = "testing";
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\t");
      _builder.append("package com.holycityaudio.SpinCAD;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("import com.holycityaudio.SpinCAD.SpinCADBlock;");
      _builder.newLine();
      {
        EList<Element> _elements = mn.getElements();
        for(final Element m : _elements) {
          _builder.append("\t");
          CharSequence _switchResult = null;
          boolean _matched = false;
          if (!_matched) {
            if (m instanceof MENU_ITEM) {
              final MENU_ITEM _mENU_ITEM = (MENU_ITEM)m;
              _matched=true;
              CharSequence _importMenuItem = this.importMenuItem(_mENU_ITEM);
              _switchResult = _importMenuItem;
            }
          }
          _builder.append(_switchResult, "	");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.newLine();
      _builder.append("\t");
      _builder.append("import java.awt.event.ActionEvent;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("import java.awt.event.ActionListener;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("import javax.swing.JMenu;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("import javax.swing.JMenuBar;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("import javax.swing.JMenuItem;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public class ");
      Resource _eResource = mn.eResource();
      String _className = this.className(_eResource);
      String _plus = (_className + "Menu");
      _builder.append(_plus, "	");
      _builder.append(" {");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("//\tprivate static final long serialVersionUID = 1L;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public ");
      Resource _eResource_1 = mn.eResource();
      String _className_1 = this.className(_eResource_1);
      String _plus_1 = (_className_1 + "Menu");
      _builder.append(_plus_1, "	");
      _builder.append("(final SpinCADFrame f, final SpinCADPanel panel, JMenuBar menuBar) {");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      {
        EList<Element> _elements_1 = mn.getElements();
        for(final Element m_1 : _elements_1) {
          _builder.append("\t");
          CharSequence _switchResult_1 = null;
          boolean _matched_1 = false;
          if (!_matched_1) {
            if (m_1 instanceof MENU_HEADER) {
              final MENU_HEADER _mENU_HEADER = (MENU_HEADER)m_1;
              _matched_1=true;
              String _xblockexpression_1 = null;
              {
                String _name = _mENU_HEADER.getName();
                String _menuName = this.getMenuName(_name);
                menuNameY = _menuName;
                String _genMenu = this.genMenu(_mENU_HEADER);
                _xblockexpression_1 = (_genMenu);
              }
              _switchResult_1 = _xblockexpression_1;
            }
          }
          if (!_matched_1) {
            if (m_1 instanceof MENU_ITEM) {
              final MENU_ITEM _mENU_ITEM = (MENU_ITEM)m_1;
              _matched_1=true;
              CharSequence _genMenuItem = this.genMenuItem(_mENU_ITEM, menuNameY);
              _switchResult_1 = _genMenuItem;
            }
          }
          _builder.append(_switchResult_1, "	");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  public String genMenu(final MENU_HEADER m) {
    String _xblockexpression = null;
    {
      String _name = m.getName();
      String menuNameX = this.getMenuName(_name);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("JMenu ");
      _builder.append(menuNameX, "");
      _builder.append(" = new JMenu(\"");
      String _name_1 = m.getName();
      _builder.append(_name_1, "");
      _builder.append("\");");
      _builder.newLineIfNotEmpty();
      _builder.append("menuBar.add(");
      _builder.append(menuNameX, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _xblockexpression = (_builder.toString());
    }
    return _xblockexpression;
  }
  
  public CharSequence genMenuItem(final MENU_ITEM m, final String menuName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("final JMenuItem mntm_");
    String _className = m.getClassName();
    _builder.append(_className, "");
    _builder.append(" = new JMenuItem(\"");
    String _name = m.getName();
    _builder.append(_name, "");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("mntm_");
    String _className_1 = m.getClassName();
    _builder.append(_className_1, "");
    _builder.append(".addActionListener(new ActionListener() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public void actionPerformed(ActionEvent e) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("SpinCADBlock pcB = new ");
    String _className_2 = m.getClassName();
    _builder.append(_className_2, "		");
    _builder.append("CADBlock(50, 100);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("f.dropBlock(panel, pcB);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("});");
    _builder.newLine();
    _builder.append(menuName, "");
    _builder.append(".add(mntm_");
    String _className_3 = m.getClassName();
    _builder.append(_className_3, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence importMenuItem(final MENU_ITEM m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import com.holycityaudio.SpinCAD.CADBlocks.");
    String _className = m.getClassName();
    _builder.append(_className, "");
    _builder.append("CADBlock;");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public String getMenuName(final String header) {
    String _xblockexpression = null;
    {
      String menuName = header.replaceAll("\\s+", "");
      String _replaceAll = menuName.replaceAll("\\/", "");
      menuName = _replaceAll;
      String _replaceAll_1 = menuName.replaceAll("-", "_");
      menuName = _replaceAll_1;
      String _lowerCase = menuName.toLowerCase();
      String _plus = ("mn_" + _lowerCase);
      _xblockexpression = (_plus);
    }
    return _xblockexpression;
  }
}