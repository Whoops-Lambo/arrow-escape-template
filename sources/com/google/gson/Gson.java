package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import defpackage.ai2;
import defpackage.cu;
import defpackage.em0;
import defpackage.es2;
import defpackage.fs2;
import defpackage.ha1;
import defpackage.hs2;
import defpackage.ig1;
import defpackage.is2;
import defpackage.jv0;
import defpackage.kb1;
import defpackage.kv0;
import defpackage.lv0;
import defpackage.m8;
import defpackage.ms2;
import defpackage.mx;
import defpackage.nh1;
import defpackage.nq2;
import defpackage.qa1;
import defpackage.t91;
import defpackage.tj2;
import defpackage.ts2;
import defpackage.u32;
import defpackage.ub1;
import defpackage.vi0;
import defpackage.vq2;
import defpackage.wa1;
import defpackage.wb1;
import defpackage.wr1;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class Gson {
    static final boolean DEFAULT_COMPLEX_MAP_KEYS = false;
    static final boolean DEFAULT_ESCAPE_HTML = true;
    static final boolean DEFAULT_JSON_NON_EXECUTABLE = false;
    static final boolean DEFAULT_LENIENT = false;
    static final boolean DEFAULT_PRETTY_PRINT = false;
    static final boolean DEFAULT_SERIALIZE_NULLS = false;
    static final boolean DEFAULT_SPECIALIZE_FLOAT_VALUES = false;
    private static final String JSON_NON_EXECUTABLE_PREFIX = ")]}'\n";
    private static final ts2 NULL_KEY_SURROGATE = new ts2(Object.class);
    final List<fs2> builderFactories;
    final List<fs2> builderHierarchyFactories;
    private final ThreadLocal<Map<ts2, lv0>> calls;
    final boolean complexMapKeySerialization;
    private final mx constructorConstructor;
    final String datePattern;
    final int dateStyle;
    final vi0 excluder;
    final List<fs2> factories;
    final FieldNamingStrategy fieldNamingStrategy;
    final boolean generateNonExecutableJson;
    final boolean htmlSafe;
    final Map<Type, Object> instanceCreators;
    private final t91 jsonAdapterFactory;
    final boolean lenient;
    final ig1 longSerializationPolicy;
    final boolean prettyPrinting;
    final boolean serializeNulls;
    final boolean serializeSpecialFloatingPointValues;
    final int timeStyle;
    private final Map<ts2, es2> typeTokenCache;

    public Gson(vi0 vi0Var, FieldNamingStrategy fieldNamingStrategy, Map<Type, Object> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, ig1 ig1Var, String str, int i, int i2, List<fs2> list, List<fs2> list2, List<fs2> list3) {
        this.calls = new ThreadLocal<>();
        this.typeTokenCache = new ConcurrentHashMap();
        this.excluder = vi0Var;
        this.fieldNamingStrategy = fieldNamingStrategy;
        this.instanceCreators = map;
        mx mxVar = new mx(map);
        this.constructorConstructor = mxVar;
        this.serializeNulls = z;
        this.complexMapKeySerialization = z2;
        this.generateNonExecutableJson = z3;
        this.htmlSafe = z4;
        this.prettyPrinting = z5;
        this.lenient = z6;
        this.serializeSpecialFloatingPointValues = z7;
        this.longSerializationPolicy = ig1Var;
        this.datePattern = str;
        this.dateStyle = i;
        this.timeStyle = i2;
        this.builderFactories = list;
        this.builderHierarchyFactories = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(ms2.C);
        arrayList.add(wr1.b);
        arrayList.add(vi0Var);
        arrayList.addAll(list3);
        arrayList.add(ms2.r);
        arrayList.add(ms2.g);
        arrayList.add(ms2.d);
        arrayList.add(ms2.e);
        arrayList.add(ms2.f);
        es2 es2VarLongAdapter = longAdapter(ig1Var);
        arrayList.add(new is2(Long.TYPE, Long.class, es2VarLongAdapter));
        arrayList.add(new is2(Double.TYPE, Double.class, doubleAdapter(z7)));
        arrayList.add(new is2(Float.TYPE, Float.class, floatAdapter(z7)));
        arrayList.add(ms2.n);
        arrayList.add(ms2.h);
        arrayList.add(ms2.i);
        int i3 = 0;
        arrayList.add(new hs2(AtomicLong.class, atomicLongAdapter(es2VarLongAdapter), i3));
        arrayList.add(new hs2(AtomicLongArray.class, atomicLongArrayAdapter(es2VarLongAdapter), i3));
        arrayList.add(ms2.j);
        arrayList.add(ms2.o);
        arrayList.add(ms2.s);
        arrayList.add(ms2.t);
        arrayList.add(new hs2(BigDecimal.class, ms2.p, i3));
        arrayList.add(new hs2(BigInteger.class, ms2.q, i3));
        arrayList.add(ms2.u);
        arrayList.add(ms2.v);
        arrayList.add(ms2.x);
        arrayList.add(ms2.y);
        arrayList.add(ms2.B);
        arrayList.add(ms2.w);
        arrayList.add(ms2.b);
        arrayList.add(ai2.e);
        arrayList.add(ms2.A);
        arrayList.add(ai2.d);
        arrayList.add(ai2.c);
        arrayList.add(ms2.z);
        arrayList.add(m8.d);
        arrayList.add(ms2.a);
        arrayList.add(new cu(mxVar, i3));
        arrayList.add(new nh1(mxVar, z2));
        t91 t91Var = new t91(mxVar);
        this.jsonAdapterFactory = t91Var;
        arrayList.add(t91Var);
        arrayList.add(ms2.D);
        arrayList.add(new u32(mxVar, fieldNamingStrategy, vi0Var, t91Var));
        this.factories = Collections.unmodifiableList(arrayList);
    }

    private static void assertFullConsumption(Object obj, JsonReader jsonReader) {
        if (obj != null) {
            try {
                if (jsonReader.peek() == JsonToken.END_DOCUMENT) {
                } else {
                    throw new qa1("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e) {
                throw new kb1(e);
            } catch (IOException e2) {
                throw new qa1(e2);
            }
        }
    }

    private static es2 atomicLongAdapter(es2 es2Var) {
        return new kv0(new kv0(es2Var, 0), 2);
    }

    private static es2 atomicLongArrayAdapter(es2 es2Var) {
        return new kv0(new kv0(es2Var, 1), 2);
    }

    private es2 doubleAdapter(boolean z) {
        return z ? ms2.m : new jv0(0);
    }

    private es2 floatAdapter(boolean z) {
        return z ? ms2.l : new jv0(1);
    }

    private static es2 longAdapter(ig1 ig1Var) {
        return ig1Var == ig1.a ? ms2.k : new jv0(2);
    }

    public vi0 excluder() {
        return this.excluder;
    }

    public FieldNamingStrategy fieldNamingStrategy() {
        return this.fieldNamingStrategy;
    }

    public <T> T fromJson(JsonReader jsonReader, Type type) throws qa1, kb1 {
        boolean zIsLenient = jsonReader.isLenient();
        boolean z = true;
        jsonReader.setLenient(true);
        try {
            try {
                try {
                    jsonReader.peek();
                    z = false;
                    T t = (T) getAdapter(new ts2(type)).a(jsonReader);
                    jsonReader.setLenient(zIsLenient);
                    return t;
                } catch (EOFException e) {
                    if (!z) {
                        throw new kb1(e);
                    }
                    jsonReader.setLenient(zIsLenient);
                    return null;
                } catch (AssertionError e2) {
                    AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.8): " + e2.getMessage());
                    assertionError.initCause(e2);
                    throw assertionError;
                }
            } catch (IOException e3) {
                throw new kb1(e3);
            } catch (IllegalStateException e4) {
                throw new kb1(e4);
            }
        } catch (Throwable th) {
            jsonReader.setLenient(zIsLenient);
            throw th;
        }
    }

    public <T> es2 getAdapter(ts2 ts2Var) {
        boolean z;
        es2 es2Var = this.typeTokenCache.get(ts2Var == null ? NULL_KEY_SURROGATE : ts2Var);
        if (es2Var != null) {
            return es2Var;
        }
        Map<ts2, lv0> map = this.calls.get();
        if (map == null) {
            map = new HashMap<>();
            this.calls.set(map);
            z = true;
        } else {
            z = false;
        }
        lv0 lv0Var = map.get(ts2Var);
        if (lv0Var != null) {
            return lv0Var;
        }
        try {
            lv0 lv0Var2 = new lv0();
            map.put(ts2Var, lv0Var2);
            Iterator<fs2> it = this.factories.iterator();
            while (it.hasNext()) {
                es2 es2VarA = it.next().a(this, ts2Var);
                if (es2VarA != null) {
                    if (lv0Var2.a != null) {
                        throw new AssertionError();
                    }
                    lv0Var2.a = es2VarA;
                    this.typeTokenCache.put(ts2Var, es2VarA);
                    map.remove(ts2Var);
                    if (z) {
                        this.calls.remove();
                    }
                    return es2VarA;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.8) cannot handle " + ts2Var);
        } catch (Throwable th) {
            map.remove(ts2Var);
            if (z) {
                this.calls.remove();
            }
            throw th;
        }
    }

    public <T> es2 getDelegateAdapter(fs2 fs2Var, ts2 ts2Var) {
        if (!this.factories.contains(fs2Var)) {
            fs2Var = this.jsonAdapterFactory;
        }
        boolean z = false;
        for (fs2 fs2Var2 : this.factories) {
            if (z) {
                es2 es2VarA = fs2Var2.a(this, ts2Var);
                if (es2VarA != null) {
                    return es2VarA;
                }
            } else if (fs2Var2 == fs2Var) {
                z = true;
            }
        }
        vq2.r(ts2Var, "GSON cannot serialize ");
        return null;
    }

    public boolean htmlSafe() {
        return this.htmlSafe;
    }

    public GsonBuilder newBuilder() {
        return new GsonBuilder(this);
    }

    public JsonReader newJsonReader(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        jsonReader.setLenient(this.lenient);
        return jsonReader;
    }

    public JsonWriter newJsonWriter(Writer writer) throws IOException {
        if (this.generateNonExecutableJson) {
            writer.write(JSON_NON_EXECUTABLE_PREFIX);
        }
        JsonWriter jsonWriter = new JsonWriter(writer);
        if (this.prettyPrinting) {
            jsonWriter.setIndent("  ");
        }
        jsonWriter.setSerializeNulls(this.serializeNulls);
        return jsonWriter;
    }

    public boolean serializeNulls() {
        return this.serializeNulls;
    }

    public void toJson(Object obj, Type type, JsonWriter jsonWriter) throws qa1 {
        es2 adapter = getAdapter(new ts2(type));
        boolean zIsLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean zIsHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.htmlSafe);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.serializeNulls);
        try {
            try {
                try {
                    adapter.b(jsonWriter, obj);
                    jsonWriter.setLenient(zIsLenient);
                    jsonWriter.setHtmlSafe(zIsHtmlSafe);
                    jsonWriter.setSerializeNulls(serializeNulls);
                } catch (AssertionError e) {
                    AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.8): " + e.getMessage());
                    assertionError.initCause(e);
                    throw assertionError;
                }
            } catch (IOException e2) {
                throw new qa1(e2);
            }
        } catch (Throwable th) {
            jsonWriter.setLenient(zIsLenient);
            jsonWriter.setHtmlSafe(zIsHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
            throw th;
        }
    }

    public ha1 toJsonTree(Object obj) {
        return obj == null ? wa1.a : toJsonTree(obj, obj.getClass());
    }

    public String toString() {
        return "{serializeNulls:" + this.serializeNulls + ",factories:" + this.factories + ",instanceCreators:" + this.constructorConstructor + "}";
    }

    public static void checkValidFloatingPoint(double d) {
        if (!Double.isNaN(d) && !Double.isInfinite(d)) {
            return;
        }
        throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
    }

    public ha1 toJsonTree(Object obj, Type type) {
        wb1 wb1Var = new wb1();
        toJson(obj, type, wb1Var);
        return wb1Var.d();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Gson() {
        vi0 vi0Var = vi0.g;
        Map map = Collections.EMPTY_MAP;
        List list = Collections.EMPTY_LIST;
        this(vi0Var, em0.a, map, false, false, false, true, false, false, false, ig1.a, null, 2, 2, list, list, list);
    }

    public <T> T fromJson(String str, Type type) throws kb1 {
        if (str == null) {
            return null;
        }
        return (T) fromJson(new StringReader(str), type);
    }

    public void toJson(Object obj, Type type, Appendable appendable) throws qa1 {
        try {
            toJson(obj, type, newJsonWriter(appendable instanceof Writer ? (Writer) appendable : new tj2(appendable)));
        } catch (IOException e) {
            throw new qa1(e);
        }
    }

    public <T> T fromJson(Reader reader, Class<T> cls) throws qa1, kb1 {
        JsonReader jsonReaderNewJsonReader = newJsonReader(reader);
        Object objFromJson = fromJson(jsonReaderNewJsonReader, cls);
        assertFullConsumption(objFromJson, jsonReaderNewJsonReader);
        return (T) nq2.p(cls).cast(objFromJson);
    }

    public String toJson(Object obj) {
        if (obj == null) {
            return toJson((ha1) wa1.a);
        }
        return toJson(obj, obj.getClass());
    }

    public <T> T fromJson(Reader reader, Type type) throws qa1, kb1 {
        JsonReader jsonReaderNewJsonReader = newJsonReader(reader);
        T t = (T) fromJson(jsonReaderNewJsonReader, type);
        assertFullConsumption(t, jsonReaderNewJsonReader);
        return t;
    }

    public String toJson(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        toJson(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public <T> T fromJson(String str, Class<T> cls) throws kb1 {
        return (T) nq2.p(cls).cast(fromJson(str, (Type) cls));
    }

    public void toJson(Object obj, Appendable appendable) throws qa1 {
        if (obj != null) {
            toJson(obj, obj.getClass(), appendable);
        } else {
            toJson((ha1) wa1.a, appendable);
        }
    }

    public <T> T fromJson(ha1 ha1Var, Class<T> cls) throws kb1 {
        return (T) nq2.p(cls).cast(fromJson(ha1Var, (Type) cls));
    }

    public void toJson(ha1 ha1Var, Appendable appendable) throws qa1 {
        try {
            toJson(ha1Var, newJsonWriter(appendable instanceof Writer ? (Writer) appendable : new tj2(appendable)));
        } catch (IOException e) {
            throw new qa1(e);
        }
    }

    public <T> T fromJson(ha1 ha1Var, Type type) throws kb1 {
        if (ha1Var == null) {
            return null;
        }
        ub1 ub1Var = new ub1(ub1.e);
        ub1Var.a = new Object[32];
        ub1Var.b = 0;
        ub1Var.c = new String[32];
        ub1Var.d = new int[32];
        ub1Var.o(ha1Var);
        return (T) fromJson(ub1Var, type);
    }

    public String toJson(ha1 ha1Var) {
        StringWriter stringWriter = new StringWriter();
        toJson(ha1Var, (Appendable) stringWriter);
        return stringWriter.toString();
    }

    public void toJson(ha1 ha1Var, JsonWriter jsonWriter) throws qa1 {
        boolean zIsLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean zIsHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.htmlSafe);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.serializeNulls);
        try {
            try {
                hs2 hs2Var = ms2.a;
                jv0.d(ha1Var, jsonWriter);
                jsonWriter.setLenient(zIsLenient);
                jsonWriter.setHtmlSafe(zIsHtmlSafe);
                jsonWriter.setSerializeNulls(serializeNulls);
            } catch (IOException e) {
                throw new qa1(e);
            } catch (AssertionError e2) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.8): " + e2.getMessage());
                assertionError.initCause(e2);
                throw assertionError;
            }
        } catch (Throwable th) {
            jsonWriter.setLenient(zIsLenient);
            jsonWriter.setHtmlSafe(zIsHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
            throw th;
        }
    }

    public <T> es2 getAdapter(Class<T> cls) {
        return getAdapter(new ts2(cls));
    }
}
