package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;
import defpackage.b8;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class ResultDiagnostics implements ProfileInstaller.DiagnosticsCallback {
        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public final void a(int i, Object obj) {
            ((ProfileInstaller.AnonymousClass2) ProfileInstaller.b).a(i, obj);
            ProfileInstallReceiver.this.setResultCode(i);
        }

        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public final void b() {
            ((ProfileInstaller.AnonymousClass2) ProfileInstaller.b).b();
        }

        public ResultDiagnostics() {
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            ProfileInstaller.b(context, new b8(1), new ResultDiagnostics(), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if (!"WRITE_SKIP_FILE".equals(string)) {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        ResultDiagnostics resultDiagnostics = new ResultDiagnostics();
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        resultDiagnostics.a(11, null);
                        return;
                    }
                    return;
                }
                ResultDiagnostics resultDiagnostics2 = new ResultDiagnostics();
                try {
                    ProfileInstaller.a(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    resultDiagnostics2.a(10, null);
                    return;
                } catch (PackageManager.NameNotFoundException e) {
                    resultDiagnostics2.a(7, e);
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            ResultDiagnostics resultDiagnostics3 = new ResultDiagnostics();
            Process.sendSignal(Process.myPid(), 10);
            resultDiagnostics3.a(12, null);
        } else {
            if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
                return;
            }
            String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
            ResultDiagnostics resultDiagnostics4 = new ResultDiagnostics();
            if (!"DROP_SHADER_CACHE".equals(string2)) {
                resultDiagnostics4.a(16, null);
            } else if (BenchmarkOperation.a(context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
                resultDiagnostics4.a(14, null);
            } else {
                resultDiagnostics4.a(15, null);
            }
        }
    }
}
