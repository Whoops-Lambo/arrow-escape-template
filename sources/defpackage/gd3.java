package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.IBinder;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class gd3 implements ga3 {
    public final ga3 a;
    public gb b;

    @Override // defpackage.ga3
    public String d() {
        return null;
    }

    @Override // defpackage.ga3
    public void destroy() {
        this.b = null;
        this.a.destroy();
    }

    @Override // defpackage.ga3
    public String i() {
        return null;
    }

    @Override // defpackage.ga3
    public boolean j() {
        return false;
    }

    @Override // defpackage.ga3
    public void a(String str) {
        gb gbVar = this.b;
        if (gbVar != null) {
            gbVar.onIgniteServiceAuthenticationFailed(str);
        }
    }

    @Override // defpackage.ga3
    public void b(String str) {
        gb gbVar = this.b;
        if (gbVar != null) {
            gbVar.onIgniteServiceConnectionFailed(str);
        }
    }

    @Override // defpackage.ga3
    public void c(String str) {
        gb gbVar = this.b;
        if (gbVar != null) {
            gbVar.onIgniteServiceAuthenticated(str);
        }
    }

    @Override // defpackage.ga3
    public final String e() {
        return this.a.e();
    }

    @Override // defpackage.ga3
    public boolean f() {
        return this.a.f();
    }

    @Override // defpackage.ga3
    public Context g() {
        return this.a.g();
    }

    @Override // defpackage.ga3
    public boolean h() {
        return this.a.h();
    }

    @Override // defpackage.ga3
    public IIgniteServiceAPI k() {
        return this.a.k();
    }

    @Override // defpackage.ia3
    public void onCredentialsRequestFailed(String str) {
        this.a.onCredentialsRequestFailed(str);
    }

    @Override // defpackage.ia3
    public void onCredentialsRequestSuccess(String str, String str2) {
        this.a.onCredentialsRequestSuccess(str, str2);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.onServiceConnected(componentName, iBinder);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.a.onServiceDisconnected(componentName);
    }

    public gd3(ga3 ga3Var, gb gbVar) {
        this.a = ga3Var;
        this.b = gbVar;
        ga3Var.b(this);
        ga3Var.a(this);
    }

    @Override // defpackage.ga3
    public boolean a() {
        return this.a.a();
    }

    @Override // defpackage.ga3
    public void b() {
        this.a.b();
    }

    @Override // defpackage.ga3
    public boolean c() {
        return this.a.c();
    }

    @Override // defpackage.ga3
    public final void a(gd3 gd3Var) {
        this.a.a(gd3Var);
    }

    @Override // defpackage.ga3
    public final void b(gd3 gd3Var) {
        this.a.b(gd3Var);
    }

    @Override // defpackage.ga3
    public void c(ComponentName componentName, IBinder iBinder) {
        gb gbVar = this.b;
        if (gbVar != null) {
            gbVar.onIgniteServiceConnected(componentName, iBinder);
        }
    }
}
