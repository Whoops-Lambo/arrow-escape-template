package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import defpackage.vv;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@RequiresApi
@RestrictTo
public class DeviceProfileWriter {
    public final Executor a;
    public final ProfileInstaller.DiagnosticsCallback b;
    public final byte[] c;
    public final File d;
    public final String e;
    public boolean f = false;
    public DexProfileData[] g;
    public byte[] h;

    public final void b(int i, Serializable serializable) {
        this.a.execute(new vv(this, i, serializable, 2));
    }

    public DeviceProfileWriter(AssetManager assetManager, Executor executor, ProfileInstaller.DiagnosticsCallback diagnosticsCallback, String str, File file) {
        this.a = executor;
        this.b = diagnosticsCallback;
        this.e = str;
        this.d = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i <= 34) {
            switch (i) {
                case 25:
                    bArr = ProfileVersion.e;
                    break;
                case 26:
                    bArr = ProfileVersion.d;
                    break;
                case 27:
                    bArr = ProfileVersion.c;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = ProfileVersion.b;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = ProfileVersion.a;
                    break;
            }
        }
        this.c = bArr;
    }

    public final FileInputStream a(String str, AssetManager assetManager) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                this.b.b();
                return null;
            }
            return null;
        }
    }
}
