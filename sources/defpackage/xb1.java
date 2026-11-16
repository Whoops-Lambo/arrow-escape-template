package defpackage;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class xb1 implements tr1, w43 {
    public final boolean a = true;
    public final JsonWriter b;
    public final Map c;
    public final Map d;
    public final sr1 e;
    public final boolean f;

    @Override // defpackage.tr1
    public final tr1 b(wl0 wl0Var, boolean z) throws IOException {
        String str = wl0Var.a;
        i();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        i();
        jsonWriter.value(z);
        return this;
    }

    @Override // defpackage.tr1
    public final tr1 c(wl0 wl0Var, int i) throws IOException {
        String str = wl0Var.a;
        i();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        i();
        jsonWriter.value(i);
        return this;
    }

    @Override // defpackage.tr1
    public final tr1 d(wl0 wl0Var, double d) throws IOException {
        String str = wl0Var.a;
        i();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        i();
        jsonWriter.value(d);
        return this;
    }

    @Override // defpackage.tr1
    public final tr1 e(wl0 wl0Var, long j) throws IOException {
        String str = wl0Var.a;
        i();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        i();
        jsonWriter.value(j);
        return this;
    }

    @Override // defpackage.tr1
    public final tr1 f(wl0 wl0Var, Object obj) throws IOException {
        h(obj, wl0Var.a);
        return this;
    }

    public final xb1 g(Object obj) throws IOException {
        JsonWriter jsonWriter = this.b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    g(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        h(entry.getValue(), (String) key);
                    } catch (ClassCastException e) {
                        throw new tg0(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            sr1 sr1Var = (sr1) this.c.get(obj.getClass());
            if (sr1Var != null) {
                jsonWriter.beginObject();
                sr1Var.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            v43 v43Var = (v43) this.d.get(obj.getClass());
            if (v43Var != null) {
                v43Var.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.e.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            if (obj instanceof pr1) {
                int number = ((pr1) obj).getNumber();
                i();
                jsonWriter.value(number);
                return this;
            }
            String strName = ((Enum) obj).name();
            i();
            jsonWriter.value(strName);
            return this;
        }
        if (obj instanceof byte[]) {
            i();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        int i = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i < length) {
                jsonWriter.value(iArr[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                i();
                jsonWriter.value(j);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                jsonWriter.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                jsonWriter.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i < length5) {
                g(numberArr[i]);
                i++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i < length6) {
                g(objArr[i]);
                i++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final xb1 h(Object obj, String str) throws IOException {
        boolean z = this.f;
        JsonWriter jsonWriter = this.b;
        if (z) {
            if (obj == null) {
                return this;
            }
            i();
            jsonWriter.name(str);
            g(obj);
            return this;
        }
        i();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        g(obj);
        return this;
    }

    public final void i() {
        if (this.a) {
            return;
        }
        e32.i("Parent context used since this context was created. Cannot use this context anymore.");
    }

    public xb1(Writer writer, HashMap map, HashMap map2, aa1 aa1Var, boolean z) {
        this.b = new JsonWriter(writer);
        this.c = map;
        this.d = map2;
        this.e = aa1Var;
        this.f = z;
    }

    @Override // defpackage.w43
    public final w43 a(boolean z) throws IOException {
        i();
        this.b.value(z);
        return this;
    }

    @Override // defpackage.w43
    public final w43 add(String str) throws IOException {
        i();
        this.b.value(str);
        return this;
    }
}
