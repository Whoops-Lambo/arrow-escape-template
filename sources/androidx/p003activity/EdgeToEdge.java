package androidx.p003activity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.farimarwat.grizzly.ReportActivity;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class EdgeToEdge {
    public static final int a = Color.argb(230, 255, 255, 255);
    public static final int b = Color.argb(128, 27, 27, 27);

    public static void a(ReportActivity reportActivity) {
        EdgeToEdgeImpl edgeToEdgeApi26;
        SystemBarStyle$Companion$auto$1 systemBarStyle$Companion$auto$1 = SystemBarStyle$Companion$auto$1.i;
        SystemBarStyle systemBarStyle = new SystemBarStyle(0, 0, systemBarStyle$Companion$auto$1);
        SystemBarStyle systemBarStyle2 = new SystemBarStyle(a, b, systemBarStyle$Companion$auto$1);
        View decorView = reportActivity.getWindow().getDecorView();
        decorView.getClass();
        Resources resources = decorView.getResources();
        resources.getClass();
        boolean zBooleanValue = ((Boolean) systemBarStyle$Companion$auto$1.invoke(resources)).booleanValue();
        Resources resources2 = decorView.getResources();
        resources2.getClass();
        boolean zBooleanValue2 = ((Boolean) systemBarStyle$Companion$auto$1.invoke(resources2)).booleanValue();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            edgeToEdgeApi26 = new EdgeToEdgeApi30();
        } else if (i >= 29) {
            edgeToEdgeApi26 = new EdgeToEdgeApi29();
        } else if (i >= 28) {
            edgeToEdgeApi26 = new EdgeToEdgeApi28();
        } else {
            edgeToEdgeApi26 = i >= 26 ? new EdgeToEdgeApi26() : new EdgeToEdgeApi23();
        }
        Window window = reportActivity.getWindow();
        window.getClass();
        edgeToEdgeApi26.b(systemBarStyle, systemBarStyle2, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = reportActivity.getWindow();
        window2.getClass();
        edgeToEdgeApi26.a(window2);
    }
}
