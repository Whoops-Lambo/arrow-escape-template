package com.farimarwat.grizzly;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.p003activity.EdgeToEdge;
import defpackage.a7;
import defpackage.e32;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/farimarwat/grizzly/ReportActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Laz2;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/Intent;", "intent", "loadViews", "(Landroid/content/Intent;)V", "grizzly_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ReportActivity extends AppCompatActivity {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadViews$lambda$1(ReportActivity reportActivity, View view) {
        reportActivity.getClass();
        reportActivity.finishAndRemoveTask();
        System.exit(0);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat onCreate$lambda$0(View view, WindowInsetsCompat windowInsetsCompat) {
        view.getClass();
        windowInsetsCompat.getClass();
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        insets.getClass();
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return windowInsetsCompat;
    }

    public final void loadViews(@NotNull Intent intent) {
        intent.getClass();
        GrizzlyConstants grizzlyConstants = GrizzlyConstants.INSTANCE;
        String stringExtra = intent.getStringExtra(grizzlyConstants.getEXTRA_TITLE());
        String stringExtra2 = intent.getStringExtra(grizzlyConstants.getEXTRA_MESSAGE());
        ((TextView) findViewById(R.id.txtTitle)).setText(stringExtra);
        ((TextView) findViewById(R.id.txtMessage)).setText(stringExtra2);
        ((Button) findViewById(R.id.btnClose)).setOnClickListener(new a7(this, 21));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p003activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.a(this);
        setContentView(R.layout.activity_report);
        ViewCompat.G(findViewById(R.id.main), new e32(3));
        Intent intent = getIntent();
        intent.getClass();
        loadViews(intent);
    }
}
