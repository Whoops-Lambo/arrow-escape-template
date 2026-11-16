package defpackage;

import android.util.Base64OutputStream;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import com.google.firebase.platforminfo.GlobalLibraryVersionRegistrar;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class r80 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s80 b;

    public /* synthetic */ r80(s80 s80Var, int i) {
        this.a = i;
        this.b = s80Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String string;
        int i = 6;
        dy dyVar = null;
        switch (this.a) {
            case 0:
                s80 s80Var = this.b;
                synchronized (s80Var) {
                    try {
                        bx0 bx0Var = (bx0) s80Var.a.get();
                        ArrayList arrayListA = bx0Var.a();
                        synchronized (bx0Var) {
                            z81 z81Var = bx0Var.a;
                            l6 l6Var = new l6(bx0Var, 21);
                            z81Var.getClass();
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (int i2 = 0; i2 < arrayListA.size(); i2++) {
                            jf jfVar = (jf) arrayListA.get(i2);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", jfVar.a);
                            jSONObject.put("dates", new JSONArray((Collection) jfVar.b));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                string = byteArrayOutputStream.toString("UTF-8");
                            } catch (Throwable th) {
                                try {
                                    gZIPOutputStream.close();
                                    break;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            try {
                                base64OutputStream.close();
                                break;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                return string;
            default:
                s80 s80Var2 = this.b;
                synchronized (s80Var2) {
                    bx0 bx0Var2 = (bx0) s80Var2.a.get();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    va0 va0Var = (va0) s80Var2.c.get();
                    GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar = va0Var.b;
                    boolean zIsEmpty = globalLibraryVersionRegistrar.getRegisteredVersions().isEmpty();
                    String str = va0Var.a;
                    if (!zIsEmpty) {
                        str = str + ' ' + va0.a(globalLibraryVersionRegistrar.getRegisteredVersions());
                    }
                    synchronized (bx0Var2) {
                        String strB = bx0.b(jCurrentTimeMillis);
                        Preferences.Key keyA = PreferencesKeys.a(str);
                        z81 z81Var2 = bx0Var2.a;
                        y5 y5Var = new y5(bx0Var2, strB, str, keyA);
                        z81Var2.getClass();
                    }
                }
                return null;
        }
    }
}
