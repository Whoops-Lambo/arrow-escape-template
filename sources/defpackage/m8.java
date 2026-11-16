package defpackage;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import io.p071bidmachine.media3.extractor.ts.y;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.security.AccessController;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class m8 extends es2 {
    public static final l8 d = new l8(0);
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public m8(Class cls) {
        this.a = 4;
        this.c = new HashMap();
        this.b = new HashMap();
        try {
            for (Field field : cls.getDeclaredFields()) {
                if (field.isEnumConstant()) {
                    AccessController.doPrivileged(new ls2(field));
                    Enum r5 = (Enum) field.get(null);
                    String strName = r5.name();
                    ea2 ea2Var = (ea2) field.getAnnotation(ea2.class);
                    if (ea2Var != null) {
                        strName = ea2Var.value();
                        for (String str : ea2Var.alternate()) {
                            ((HashMap) this.c).put(str, r5);
                        }
                    }
                    ((HashMap) this.c).put(strName, r5);
                    ((HashMap) this.b).put(r5, strName);
                }
            }
        } catch (IllegalAccessException e) {
            d.p(e);
            throw null;
        }
    }

    public static void c(Class cls) {
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            return;
        }
        throw new IllegalArgumentException("Date type must be one of " + Date.class + ", " + Timestamp.class + ", or " + java.sql.Date.class + " but was " + cls);
    }

    @Override // defpackage.es2
    public final Object a(JsonReader jsonReader) throws IOException {
        Date dateB;
        Object date;
        Object objNewInstance = null;
        Collection collection = null;
        switch (this.a) {
            case 0:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    ArrayList arrayList = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        arrayList.add(((gs2) this.b).b.a(jsonReader));
                    }
                    jsonReader.endArray();
                    int size = arrayList.size();
                    objNewInstance = Array.newInstance((Class<?>) this.c, size);
                    for (int i = 0; i < size; i++) {
                        Array.set(objNewInstance, i, arrayList.get(i));
                    }
                }
                return objNewInstance;
            case 1:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    collection = (Collection) ((rr1) this.c).i();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        collection.add(((gs2) this.b).b.a(jsonReader));
                    }
                    jsonReader.endArray();
                }
                return collection;
            case 2:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String strNextString = jsonReader.nextString();
                synchronized (((ArrayList) this.b)) {
                    ArrayList arrayList2 = (ArrayList) this.b;
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 < size2) {
                            Object obj = arrayList2.get(i2);
                            i2++;
                            try {
                                dateB = ((DateFormat) obj).parse(strNextString);
                            } catch (ParseException unused) {
                            }
                        } else {
                            try {
                                dateB = y11.b(strNextString, new ParsePosition(0));
                            } catch (ParseException e) {
                                throw new kb1(strNextString, e);
                            }
                        }
                    }
                }
                Class cls = (Class) this.c;
                if (cls == Date.class) {
                    return dateB;
                }
                if (cls == Timestamp.class) {
                    date = new Timestamp(dateB.getTime());
                } else {
                    if (cls != java.sql.Date.class) {
                        y.o();
                        return null;
                    }
                    date = new java.sql.Date(dateB.getTime());
                }
                return date;
            case 3:
                Class cls2 = (Class) this.c;
                Object objA = ((hs2) this.b).c.a(jsonReader);
                if (objA == null || cls2.isInstance(objA)) {
                    return objA;
                }
                throw new kb1("Expected a " + cls2.getName() + " but was " + objA.getClass().getName());
            default:
                if (jsonReader.peek() != JsonToken.NULL) {
                    return (Enum) ((HashMap) this.c).get(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
        }
    }

    @Override // defpackage.es2
    public final void b(JsonWriter jsonWriter, Object obj) throws IOException {
        switch (this.a) {
            case 0:
                if (obj == null) {
                    jsonWriter.nullValue();
                    return;
                }
                jsonWriter.beginArray();
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    ((gs2) this.b).b(jsonWriter, Array.get(obj, i));
                }
                jsonWriter.endArray();
                return;
            case 1:
                Collection collection = (Collection) obj;
                if (collection == null) {
                    jsonWriter.nullValue();
                    return;
                }
                jsonWriter.beginArray();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    ((gs2) this.b).b(jsonWriter, it.next());
                }
                jsonWriter.endArray();
                return;
            case 2:
                Date date = (Date) obj;
                if (date == null) {
                    jsonWriter.nullValue();
                    return;
                }
                synchronized (((ArrayList) this.b)) {
                    jsonWriter.value(((DateFormat) ((ArrayList) this.b).get(0)).format(date));
                    break;
                }
                return;
            case 3:
                ((hs2) this.b).c.b(jsonWriter, obj);
                return;
            default:
                Enum r6 = (Enum) obj;
                jsonWriter.value(r6 == null ? null : (String) ((HashMap) this.b).get(r6));
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                DateFormat dateFormat = (DateFormat) ((ArrayList) this.b).get(0);
                if (dateFormat instanceof SimpleDateFormat) {
                    return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
                }
                return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
            default:
                return super.toString();
        }
    }

    public m8(hs2 hs2Var, Class cls) {
        this.a = 3;
        this.b = hs2Var;
        this.c = cls;
    }

    public m8(Gson gson, es2 es2Var, Class cls) {
        this.a = 0;
        this.b = new gs2(gson, es2Var, cls);
        this.c = cls;
    }

    public m8(Gson gson, Type type, es2 es2Var, rr1 rr1Var) {
        this.a = 1;
        this.b = new gs2(gson, es2Var, type);
        this.c = rr1Var;
    }

    public m8(int i, int i2, Class cls) {
        this.a = 2;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        c(cls);
        this.c = cls;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (b91.a >= 9) {
            arrayList.add(s71.q(i, i2));
        }
    }

    public m8(Class cls, String str) {
        this.a = 2;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        c(cls);
        this.c = cls;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }
}
