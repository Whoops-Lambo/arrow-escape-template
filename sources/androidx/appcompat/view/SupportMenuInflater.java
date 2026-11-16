package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.appcompat.widget.DrawableUtils;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.internal.view.SupportMenu;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.ActionProvider;
import androidx.core.view.MenuItemCompat;
import defpackage.dr0;
import defpackage.e32;
import defpackage.h50;
import io.p071bidmachine.media3.extractor.ts.y;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo
public class SupportMenuInflater extends MenuInflater {
    public static final Class[] e;
    public static final Class[] f;
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class InflatedOnMenuItemClickListener implements MenuItem.OnMenuItemClickListener {
        public static final Class[] c = {MenuItem.class};
        public Object a;
        public Method b;

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            Object obj = this.a;
            Method method = this.b;
            try {
                if (method.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                }
                method.invoke(obj, menuItem);
                return true;
            } catch (Exception e) {
                dr0.m(e);
                return false;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class MenuState {
        public CharSequence A;
        public CharSequence B;
        public final Menu a;
        public boolean h;
        public int i;
        public int j;
        public CharSequence k;
        public CharSequence l;
        public int m;
        public char n;
        public int o;
        public char p;
        public int q;
        public int r;
        public boolean s;
        public boolean t;
        public boolean u;
        public int v;
        public int w;
        public String x;
        public String y;
        public ActionProvider z;
        public ColorStateList C = null;
        public PorterDuff.Mode D = null;
        public int b = 0;
        public int c = 0;
        public int d = 0;
        public int e = 0;
        public boolean f = true;
        public boolean g = true;

        public final Object a(String str, Class[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, SupportMenuInflater.this.c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        public final void b(MenuItem menuItem) {
            SupportMenuInflater supportMenuInflater = SupportMenuInflater.this;
            Context context = supportMenuInflater.c;
            boolean z = false;
            menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
            int i = this.v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.y != null) {
                if (context.isRestricted()) {
                    e32.i("The android:onClick attribute cannot be used within a restricted context");
                    return;
                }
                if (supportMenuInflater.d == null) {
                    supportMenuInflater.d = SupportMenuInflater.a(context);
                }
                Object obj = supportMenuInflater.d;
                String str = this.y;
                InflatedOnMenuItemClickListener inflatedOnMenuItemClickListener = new InflatedOnMenuItemClickListener();
                inflatedOnMenuItemClickListener.a = obj;
                Class<?> cls = obj.getClass();
                try {
                    inflatedOnMenuItemClickListener.b = cls.getMethod(str, InflatedOnMenuItemClickListener.c);
                    menuItem.setOnMenuItemClickListener(inflatedOnMenuItemClickListener);
                } catch (Exception e) {
                    StringBuilder sbR = h50.r("Couldn't resolve menu item onClick handler ", str, " in class ");
                    sbR.append(cls.getName());
                    InflateException inflateException = new InflateException(sbR.toString());
                    inflateException.initCause(e);
                    throw inflateException;
                }
            }
            if (this.r >= 2) {
                if (menuItem instanceof MenuItemImpl) {
                    MenuItemImpl menuItemImpl = (MenuItemImpl) menuItem;
                    menuItemImpl.x = (menuItemImpl.x & (-5)) | 4;
                } else if (menuItem instanceof MenuItemWrapperICS) {
                    MenuItemWrapperICS menuItemWrapperICS = (MenuItemWrapperICS) menuItem;
                    SupportMenuItem supportMenuItem = menuItemWrapperICS.d;
                    try {
                        if (menuItemWrapperICS.e == null) {
                            menuItemWrapperICS.e = supportMenuItem.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        menuItemWrapperICS.e.invoke(supportMenuItem, Boolean.TRUE);
                    } catch (Exception e2) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                    }
                }
            }
            String str2 = this.x;
            if (str2 != null) {
                menuItem.setActionView((View) a(str2, SupportMenuInflater.e, supportMenuInflater.a));
                z = true;
            }
            int i2 = this.w;
            if (i2 > 0) {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i2);
                }
            }
            ActionProvider actionProvider = this.z;
            if (actionProvider != null) {
                if (menuItem instanceof SupportMenuItem) {
                    ((SupportMenuItem) menuItem).b(actionProvider);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            MenuItemCompat.b(menuItem, this.A);
            MenuItemCompat.f(menuItem, this.B);
            MenuItemCompat.a(menuItem, this.n, this.o);
            MenuItemCompat.e(menuItem, this.p, this.q);
            PorterDuff.Mode mode = this.D;
            if (mode != null) {
                MenuItemCompat.d(menuItem, mode);
            }
            ColorStateList colorStateList = this.C;
            if (colorStateList != null) {
                MenuItemCompat.c(menuItem, colorStateList);
            }
        }

        public MenuState(Menu menu) {
            this.a = menu;
        }
    }

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        ColorStateList colorStateList;
        MenuState menuState = new MenuState(menu);
        int eventType = xmlPullParser.getEventType();
        do {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                    break;
                } else {
                    y.j("Expecting menu, got ".concat(name));
                    return;
                }
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                y.j("Unexpected end of document");
                return;
            }
            Menu menu2 = menuState.a;
            if (eventType == i) {
                if (!z2) {
                    String name2 = xmlPullParser.getName();
                    boolean zEquals = name2.equals("group");
                    Context context = this.c;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.p);
                        menuState.b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        menuState.c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        menuState.d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        menuState.e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        menuState.f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        menuState.g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else if (name2.equals("item")) {
                        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R.styleable.q);
                        TintTypedArray tintTypedArray = new TintTypedArray(context, typedArrayObtainStyledAttributes2);
                        menuState.i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                        menuState.j = (typedArrayObtainStyledAttributes2.getInt(6, menuState.d) & 65535) | (typedArrayObtainStyledAttributes2.getInt(5, menuState.c) & (-65536));
                        menuState.k = typedArrayObtainStyledAttributes2.getText(7);
                        menuState.l = typedArrayObtainStyledAttributes2.getText(8);
                        menuState.m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                        String string = typedArrayObtainStyledAttributes2.getString(9);
                        menuState.n = string == null ? (char) 0 : string.charAt(0);
                        menuState.o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                        String string2 = typedArrayObtainStyledAttributes2.getString(10);
                        menuState.p = string2 == null ? (char) 0 : string2.charAt(0);
                        menuState.q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                        if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                            menuState.r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                        } else {
                            menuState.r = menuState.e;
                        }
                        menuState.s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                        menuState.t = typedArrayObtainStyledAttributes2.getBoolean(4, menuState.f);
                        menuState.u = typedArrayObtainStyledAttributes2.getBoolean(1, menuState.g);
                        menuState.v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                        menuState.y = typedArrayObtainStyledAttributes2.getString(12);
                        menuState.w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                        menuState.x = typedArrayObtainStyledAttributes2.getString(15);
                        String string3 = typedArrayObtainStyledAttributes2.getString(14);
                        boolean z3 = string3 != null;
                        if (z3 && menuState.w == 0 && menuState.x == null) {
                            menuState.z = (ActionProvider) menuState.a(string3, f, this.b);
                        } else {
                            if (z3) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            menuState.z = null;
                        }
                        menuState.A = typedArrayObtainStyledAttributes2.getText(17);
                        menuState.B = typedArrayObtainStyledAttributes2.getText(22);
                        if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                            menuState.D = DrawableUtils.c(typedArrayObtainStyledAttributes2.getInt(19, -1), menuState.D);
                            colorStateList = null;
                        } else {
                            colorStateList = null;
                            menuState.D = null;
                        }
                        if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                            menuState.C = tintTypedArray.a(18);
                        } else {
                            menuState.C = colorStateList;
                        }
                        tintTypedArray.f();
                        menuState.h = false;
                        xmlPullParser = xmlPullParser;
                    } else if (name2.equals("menu")) {
                        menuState.h = true;
                        SubMenu subMenuAddSubMenu = menu2.addSubMenu(menuState.b, menuState.i, menuState.j, menuState.k);
                        menuState.b(subMenuAddSubMenu.getItem());
                        xmlPullParser = xmlPullParser;
                        b(xmlPullParser, attributeSet, subMenuAddSubMenu);
                    } else {
                        xmlPullParser = xmlPullParser;
                        str = name2;
                        z2 = true;
                    }
                }
                z = z;
            } else if (eventType != 3) {
                z = z;
            } else {
                String name3 = xmlPullParser.getName();
                if (z2 && name3.equals(str)) {
                    xmlPullParser = xmlPullParser;
                    z2 = false;
                    str = null;
                } else {
                    if (name3.equals("group")) {
                        menuState.b = 0;
                        menuState.c = 0;
                        menuState.d = 0;
                        menuState.e = 0;
                        menuState.f = true;
                        menuState.g = true;
                    } else if (name3.equals("item")) {
                        if (!menuState.h) {
                            ActionProvider actionProvider = menuState.z;
                            if (actionProvider == null || !actionProvider.a()) {
                                menuState.h = true;
                                menuState.b(menu2.add(menuState.b, menuState.i, menuState.j, menuState.k));
                            } else {
                                menuState.h = true;
                                menuState.b(menu2.addSubMenu(menuState.b, menuState.i, menuState.j, menuState.k).getItem());
                            }
                        }
                    } else if (name3.equals("menu")) {
                        z = true;
                    }
                    z = z;
                }
            }
            eventType = xmlPullParser.next();
            i = 2;
            z = z;
            z2 = z2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof SupportMenu)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.c.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof MenuBuilder) {
                    MenuBuilder menuBuilder = (MenuBuilder) menu;
                    if (!menuBuilder.p) {
                        menuBuilder.w();
                        z = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((MenuBuilder) menu).v();
                }
                layout.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z) {
                ((MenuBuilder) menu).v();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }

    public SupportMenuInflater(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }
}
