package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.zzagp;
import com.google.android.gms.internal.ads.zzey;
import com.google.android.gms.internal.games_v2.zzhl;
import com.google.android.gms.internal.play_billing.zzo;
import com.unity.androidnotifications.UnityNotificationManager;
import com.unity3d.services.UnityAdsConstants;
import com.usercentrics.sdk.ui.components.UCTextView;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.concurrent.CancellationException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class wz2 implements Decoder, hw {
    public static final byte[] a = {85, 77, 78, 78};
    public static final byte[] b = {85, 77, 78, 80};
    public static final dy[] c = new dy[0];
    public static final KSerializer[] d = new KSerializer[0];

    public static kh2 F(byte[] bArr) {
        int length = bArr.length;
        bArr.getClass();
        bk bkVar = new bk();
        bkVar.t(length, bArr);
        return new kh2(bkVar);
    }

    public static int Q(Context context, String str) {
        if (str == null) {
            return 0;
        }
        try {
            Resources resources = context.getResources();
            if (resources != null) {
                int identifier = resources.getIdentifier(str, "mipmap", context.getPackageName());
                return identifier == 0 ? resources.getIdentifier(str, "drawable", context.getPackageName()) : identifier;
            }
        } catch (Resources.NotFoundException unused) {
        }
        return 0;
    }

    public static boolean V(Notification notification, DataOutputStream dataOutputStream) {
        try {
            dataOutputStream.write(a);
            dataOutputStream.writeInt(3);
            boolean z = notification.extras.getBoolean(NotificationCompat.EXTRA_SHOW_WHEN, false);
            dataOutputStream.writeInt(notification.extras.getInt("id"));
            X(dataOutputStream, notification.extras.getString(NotificationCompat.EXTRA_TITLE));
            X(dataOutputStream, notification.extras.getString(NotificationCompat.EXTRA_TEXT));
            X(dataOutputStream, notification.extras.getString(UnityNotificationManager.KEY_SMALL_ICON));
            X(dataOutputStream, notification.extras.getString(UnityNotificationManager.KEY_LARGE_ICON));
            dataOutputStream.writeLong(notification.extras.getLong(UnityNotificationManager.KEY_FIRE_TIME, -1L));
            dataOutputStream.writeLong(notification.extras.getLong(UnityNotificationManager.KEY_REPEAT_INTERVAL, -1L));
            X(dataOutputStream, notification.extras.getString(NotificationCompat.EXTRA_BIG_TEXT));
            dataOutputStream.writeBoolean(notification.extras.getBoolean(NotificationCompat.EXTRA_SHOW_CHRONOMETER, false));
            dataOutputStream.writeBoolean(z);
            X(dataOutputStream, notification.extras.getString("data"));
            dataOutputStream.writeBoolean(notification.extras.getBoolean(UnityNotificationManager.KEY_SHOW_IN_FOREGROUND, true));
            String string = notification.extras.getString(UnityNotificationManager.KEY_BIG_PICTURE);
            X(dataOutputStream, string);
            if (string != null && string.length() > 0) {
                X(dataOutputStream, notification.extras.getString(UnityNotificationManager.KEY_BIG_LARGE_ICON));
                X(dataOutputStream, notification.extras.getString(UnityNotificationManager.KEY_BIG_CONTENT_TITLE));
                X(dataOutputStream, notification.extras.getString(UnityNotificationManager.KEY_BIG_CONTENT_DESCRIPTION));
                X(dataOutputStream, notification.extras.getString(UnityNotificationManager.KEY_BIG_SUMMARY_TEXT));
                dataOutputStream.writeBoolean(notification.extras.getBoolean(UnityNotificationManager.KEY_BIG_SHOW_WHEN_COLLAPSED, false));
            }
            X(dataOutputStream, Build.VERSION.SDK_INT < 26 ? null : notification.getChannelId());
            Integer notificationColor = UnityNotificationManager.getNotificationColor(notification);
            dataOutputStream.writeBoolean(notificationColor != null);
            if (notificationColor != null) {
                dataOutputStream.writeInt(notificationColor.intValue());
            }
            dataOutputStream.writeInt(notification.number);
            dataOutputStream.writeBoolean((notification.flags & 16) != 0);
            X(dataOutputStream, notification.getGroup());
            dataOutputStream.writeBoolean((notification.flags & 512) != 0);
            dataOutputStream.writeInt(UnityNotificationManager.getNotificationGroupAlertBehavior(notification));
            X(dataOutputStream, notification.getSortKey());
            if (z) {
                dataOutputStream.writeLong(notification.when);
            }
            return true;
        } catch (Exception e) {
            Log.e("UnityNotifications", "Failed to serialize notification", e);
            return false;
        }
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean A() {
        return true;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract byte E();

    public abstract void c0(n25 n25Var, n25 n25Var2);

    public abstract void f0(n25 n25Var, Thread thread);

    public abstract boolean g0(zzo zzoVar, qr4 qr4Var, qr4 qr4Var2);

    public abstract boolean h0(zzo zzoVar, Object obj, Object obj2);

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract long i();

    public abstract boolean i0(zzo zzoVar, n25 n25Var, n25 n25Var2);

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract short k();

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract int s();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object G(d01 d01Var, fy fyVar) {
        h01 h01Var;
        ss2 ss2VarD;
        if (fyVar instanceof h01) {
            h01Var = (h01) fyVar;
            int i = h01Var.s;
            if ((i & Integer.MIN_VALUE) != 0) {
                h01Var.s = i - Integer.MIN_VALUE;
            } else {
                h01Var = new h01(fyVar);
            }
        } else {
            h01Var = new h01(fyVar);
        }
        Object objA = h01Var.r;
        int i2 = h01Var.s;
        if (i2 == 0) {
            a0(objA);
            by0 by0VarB = d01Var.b();
            vr vrVarA = p32.a(rl.class);
            try {
                ss2VarD = p32.d(rl.class);
            } catch (Throwable unused) {
                ss2VarD = null;
            }
            ns2 ns2Var = new ns2(vrVarA, ss2VarD);
            h01Var.s = 1;
            objA = by0VarB.a(ns2Var, h01Var);
            dz dzVar = dz.a;
            if (objA == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            a0(objA);
        }
        if (objA != null) {
            return (rl) objA;
        }
        d.w("null cannot be cast to non-null type io.ktor.utils.io.ByteReadChannel");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object H(d01 d01Var, Charset charset, fy fyVar) throws wg {
        i01 i01Var;
        rx rxVarQ;
        ss2 ss2VarD;
        CharsetDecoder charsetDecoder;
        if (fyVar instanceof i01) {
            i01Var = (i01) fyVar;
            int i = i01Var.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                i01Var.t = i - Integer.MIN_VALUE;
            } else {
                i01Var = new i01(fyVar);
            }
        } else {
            i01Var = new i01(fyVar);
        }
        Object objA = i01Var.s;
        int i2 = i01Var.t;
        if (i2 == 0) {
            a0(objA);
            d01Var.getClass();
            sw0 sw0VarA = d01Var.a();
            List list = qy0.a;
            String str = sw0VarA.get("Content-Type");
            if (str != null) {
                rx rxVar = rx.e;
                rxVarQ = l7.q(str);
            } else {
                rxVarQ = null;
            }
            Charset charsetC = rxVarQ != null ? ak.c(rxVarQ) : null;
            if (charsetC != null) {
                charset = charsetC;
            }
            CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
            by0 by0VarB = d01Var.b();
            vr vrVarA = p32.a(ih2.class);
            try {
                ss2VarD = p32.d(ih2.class);
            } catch (Throwable unused) {
                ss2VarD = null;
            }
            ns2 ns2Var = new ns2(vrVarA, ss2VarD);
            i01Var.r = charsetDecoderNewDecoder;
            i01Var.t = 1;
            objA = by0VarB.a(ns2Var, i01Var);
            dz dzVar = dz.a;
            if (objA == dzVar) {
                return dzVar;
            }
            charsetDecoder = charsetDecoderNewDecoder;
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            charsetDecoder = i01Var.r;
            a0(objA);
        }
        if (objA != null) {
            charsetDecoder.getClass();
            return nd4.c(charsetDecoder, (ih2) objA);
        }
        d.w("null cannot be cast to non-null type kotlinx.io.Source");
        return null;
    }

    public static LinearLayout K(Context context, int i, ArrayList arrayList) {
        float measuredWidth;
        int i2;
        Paint paint = new Paint();
        int i3 = Resources.getSystem().getDisplayMetrics().widthPixels;
        int i4 = i * 2;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        int size = arrayList.size();
        int i5 = 0;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            View view = (View) obj;
            if (view instanceof UCTextView) {
                UCTextView uCTextView = (UCTextView) view;
                paint.setTextSize(uCTextView.getTextSize());
                measuredWidth = paint.measureText(uCTextView.getText().toString());
            } else {
                measuredWidth = view.getMeasuredWidth();
            }
            float f2 = measuredWidth + i4;
            if (f + f2 > i3) {
                linearLayout.addView(linearLayout2);
                linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                i2 = -2;
                linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            } else {
                i2 = -2;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
            layoutParams.setMarginStart(0);
            layoutParams.setMarginEnd(i);
            linearLayout2.addView(view, layoutParams);
            f += f2;
        }
        if (linearLayout2.getChildCount() > 0) {
            linearLayout.addView(linearLayout2);
        }
        return linearLayout;
    }

    public static Object M(Context context, SharedPreferences sharedPreferences) throws IOException {
        String string = sharedPreferences.getString("data", "");
        if (string != null && string.length() > 0) {
            Object objN = N(context, Base64.decode(string, 0));
            if (objN != null) {
                return objN;
            }
            String string2 = sharedPreferences.getString("fallback.data", "");
            if (string2 != null && string2.length() > 0) {
                return N(context, Base64.decode(string2, 0));
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:171:0x032e  */
    /* JADX WARN: Code duplicated, block: B:180:0x0411 A[Catch: OutOfMemoryError -> 0x041e, Exception -> 0x0425, TryCatch #23 {Exception -> 0x0425, OutOfMemoryError -> 0x041e, blocks: (B:178:0x0384, B:180:0x0411, B:186:0x042e, B:188:0x0435, B:190:0x043a, B:192:0x0447, B:194:0x044d, B:195:0x0452, B:197:0x0459, B:199:0x045f, B:200:0x0464), top: B:243:0x0384 }] */
    /* JADX WARN: Code duplicated, block: B:186:0x042e A[Catch: OutOfMemoryError -> 0x041e, Exception -> 0x0425, TryCatch #23 {Exception -> 0x0425, OutOfMemoryError -> 0x041e, blocks: (B:178:0x0384, B:180:0x0411, B:186:0x042e, B:188:0x0435, B:190:0x043a, B:192:0x0447, B:194:0x044d, B:195:0x0452, B:197:0x0459, B:199:0x045f, B:200:0x0464), top: B:243:0x0384 }] */
    /* JADX WARN: Code duplicated, block: B:188:0x0435 A[Catch: OutOfMemoryError -> 0x041e, Exception -> 0x0425, TryCatch #23 {Exception -> 0x0425, OutOfMemoryError -> 0x041e, blocks: (B:178:0x0384, B:180:0x0411, B:186:0x042e, B:188:0x0435, B:190:0x043a, B:192:0x0447, B:194:0x044d, B:195:0x0452, B:197:0x0459, B:199:0x045f, B:200:0x0464), top: B:243:0x0384 }] */
    /* JADX WARN: Code duplicated, block: B:190:0x043a A[Catch: OutOfMemoryError -> 0x041e, Exception -> 0x0425, TryCatch #23 {Exception -> 0x0425, OutOfMemoryError -> 0x041e, blocks: (B:178:0x0384, B:180:0x0411, B:186:0x042e, B:188:0x0435, B:190:0x043a, B:192:0x0447, B:194:0x044d, B:195:0x0452, B:197:0x0459, B:199:0x045f, B:200:0x0464), top: B:243:0x0384 }] */
    /* JADX WARN: Code duplicated, block: B:192:0x0447 A[Catch: OutOfMemoryError -> 0x041e, Exception -> 0x0425, TryCatch #23 {Exception -> 0x0425, OutOfMemoryError -> 0x041e, blocks: (B:178:0x0384, B:180:0x0411, B:186:0x042e, B:188:0x0435, B:190:0x043a, B:192:0x0447, B:194:0x044d, B:195:0x0452, B:197:0x0459, B:199:0x045f, B:200:0x0464), top: B:243:0x0384 }] */
    /* JADX WARN: Code duplicated, block: B:197:0x0459 A[Catch: OutOfMemoryError -> 0x041e, Exception -> 0x0425, TryCatch #23 {Exception -> 0x0425, OutOfMemoryError -> 0x041e, blocks: (B:178:0x0384, B:180:0x0411, B:186:0x042e, B:188:0x0435, B:190:0x043a, B:192:0x0447, B:194:0x044d, B:195:0x0452, B:197:0x0459, B:199:0x045f, B:200:0x0464), top: B:243:0x0384 }] */
    /* JADX WARN: Code duplicated, block: B:253:? A[RETURN, SYNTHETIC] */
    public static Object N(Context context, byte[] bArr) throws IOException {
        Notification notification;
        String str;
        String str2;
        String str3;
        String str4;
        Notification.Builder builderCreateNotificationBuilder;
        Notification.Builder builder;
        String string;
        int i;
        int i2;
        int i3;
        String string2;
        String str5;
        String string3;
        String string4;
        Notification.Builder builderCreateNotificationBuilder2;
        boolean z;
        String string5;
        String string6;
        boolean z2;
        String str6;
        String strP;
        String string7;
        int i4;
        String str7;
        String str8;
        String str9;
        String strP2;
        String strP3;
        boolean z3;
        long j;
        long j2;
        boolean z4;
        String str10;
        boolean z5;
        int i5;
        boolean z6;
        int i6;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
        int i7 = 4;
        try {
            try {
                byte[] bArr2 = b;
                int i8 = 0;
                while (true) {
                    if (i8 >= 4) {
                        z6 = true;
                        break;
                    }
                    try {
                        if (dataInputStream.readByte() != bArr2[i8]) {
                            z6 = false;
                            break;
                        }
                        i8++;
                    } catch (Exception unused) {
                    }
                }
                notification = (z6 && (i6 = dataInputStream.readInt()) >= 0 && i6 <= 0) ? (Notification) ((Intent) O(dataInputStream)).getParcelableExtra(UnityNotificationManager.KEY_NOTIFICATION) : null;
            } catch (Exception e) {
                Log.e("UnityNotifications", "Failed to deserialize notification intent", e);
            }
        } catch (OutOfMemoryError e2) {
            Log.e("UnityNotifications", "Failed to deserialize notification intent", e2);
        }
        if (notification != null) {
            return notification;
        }
        byteArrayInputStream.reset();
        String str11 = "Failed to deserialize notification";
        try {
            try {
                byte[] bArr3 = a;
                int i9 = 0;
                while (true) {
                    if (i9 >= i7) {
                        z = true;
                        break;
                    }
                    try {
                        try {
                            if (dataInputStream.readByte() != bArr3[i9]) {
                                z = false;
                                break;
                            }
                            i9++;
                            i7 = 4;
                        } catch (OutOfMemoryError e3) {
                            e = e3;
                            str11 = "Failed to deserialize notification";
                            str = "UnityNotifications";
                            str2 = UnityNotificationManager.KEY_REPEAT_INTERVAL;
                            str3 = "data";
                            Log.e(str, str11, e);
                            builderCreateNotificationBuilder = null;
                            if (builderCreateNotificationBuilder != null) {
                                return builderCreateNotificationBuilder;
                            }
                            String str12 = "Failed to deserialize old style notification";
                            try {
                                try {
                                    Parcel parcelObtain = Parcel.obtain();
                                    try {
                                        parcelObtain.unmarshall(bArr, 0, bArr.length);
                                        parcelObtain.setDataPosition(0);
                                        Bundle bundle = new Bundle();
                                        bundle.readFromParcel(parcelObtain);
                                        int i10 = bundle.getInt("id", -1);
                                        String string8 = bundle.getString(UnityNotificationManager.KEY_CHANNEL_ID);
                                        String string9 = bundle.getString("textTitle");
                                        string = bundle.getString("textContent");
                                        String string10 = bundle.getString("smallIconStr");
                                        try {
                                            boolean z7 = bundle.getBoolean("autoCancel", false);
                                            boolean z8 = bundle.getBoolean("usesChronometer", false);
                                            long j3 = bundle.getLong(UnityNotificationManager.KEY_FIRE_TIME, -1L);
                                            long j4 = bundle.getLong(str2, -1L);
                                            String str13 = str;
                                            try {
                                                String string11 = bundle.getString("largeIconStr");
                                                i = bundle.getInt("style", -1);
                                                i2 = bundle.getInt("color", 0);
                                                i3 = bundle.getInt("number", 0);
                                                string2 = bundle.getString(str3);
                                                str5 = str3;
                                                string3 = bundle.getString("group");
                                                boolean z9 = bundle.getBoolean("groupSummary", false);
                                                string4 = bundle.getString("sortKey");
                                                int i11 = bundle.getInt("groupAlertBehaviour", -1);
                                                boolean z10 = bundle.getBoolean("showTimestamp", false);
                                                builderCreateNotificationBuilder2 = UnityNotificationManager.g(context).createNotificationBuilder(string8);
                                                builderCreateNotificationBuilder2.getExtras().putInt("id", i10);
                                                builderCreateNotificationBuilder2.setContentTitle(string9);
                                                builderCreateNotificationBuilder2.setContentText(string);
                                                UnityNotificationManager.setNotificationIcon(builderCreateNotificationBuilder2, UnityNotificationManager.KEY_SMALL_ICON, string10);
                                                builderCreateNotificationBuilder2.setAutoCancel(z7);
                                                builderCreateNotificationBuilder2.setUsesChronometer(z8);
                                                builderCreateNotificationBuilder2.getExtras().putLong(UnityNotificationManager.KEY_FIRE_TIME, j3);
                                                builderCreateNotificationBuilder2.getExtras().putLong(str2, j4);
                                                UnityNotificationManager.setNotificationIcon(builderCreateNotificationBuilder2, UnityNotificationManager.KEY_LARGE_ICON, string11);
                                                if (i == 2) {
                                                    builderCreateNotificationBuilder2.setStyle(new Notification.BigTextStyle().bigText(string));
                                                }
                                                if (i2 != 0) {
                                                    UnityNotificationManager.setNotificationColor(builderCreateNotificationBuilder2, i2);
                                                }
                                                if (i3 >= 0) {
                                                    builderCreateNotificationBuilder2.setNumber(i3);
                                                }
                                                if (string2 != null) {
                                                    builderCreateNotificationBuilder2.getExtras().putString(str5, string2);
                                                }
                                                if (string3 != null) {
                                                    builderCreateNotificationBuilder2.setGroup(string3);
                                                }
                                                builderCreateNotificationBuilder2.setGroupSummary(z9);
                                                if (string4 != null) {
                                                    builderCreateNotificationBuilder2.setSortKey(string4);
                                                }
                                                UnityNotificationManager.setNotificationGroupAlertBehavior(builderCreateNotificationBuilder2, i11);
                                                builderCreateNotificationBuilder2.setShowWhen(z10);
                                                builder = builderCreateNotificationBuilder2;
                                            } catch (Exception e4) {
                                                e = e4;
                                                str12 = "Failed to deserialize old style notification";
                                                str = str13;
                                                Log.e(str, str12, e);
                                                builder = null;
                                            } catch (OutOfMemoryError e5) {
                                                e = e5;
                                                str12 = "Failed to deserialize old style notification";
                                                str = str13;
                                                Log.e(str, str12, e);
                                                builder = null;
                                            }
                                        } catch (Exception e6) {
                                            e = e6;
                                            str12 = "Failed to deserialize old style notification";
                                        } catch (OutOfMemoryError e7) {
                                            e = e7;
                                            str12 = "Failed to deserialize old style notification";
                                        }
                                    } catch (Exception e8) {
                                        e = e8;
                                    }
                                } catch (Exception e9) {
                                    e = e9;
                                }
                            } catch (OutOfMemoryError e10) {
                                e = e10;
                            }
                            return builder;
                        }
                    } catch (Exception unused2) {
                    }
                }
                if (z) {
                    try {
                        int i12 = dataInputStream.readInt();
                        if (i12 < 0 || i12 > 3) {
                            str2 = UnityNotificationManager.KEY_REPEAT_INTERVAL;
                            str3 = "data";
                            str = "UnityNotifications";
                        } else {
                            Bundle bundle2 = i12 < 2 ? (Bundle) O(dataInputStream) : null;
                            if (bundle2 == null) {
                                i4 = dataInputStream.readInt();
                                string5 = P(dataInputStream);
                                String strP4 = P(dataInputStream);
                                String strP5 = P(dataInputStream);
                                strP = P(dataInputStream);
                                long j5 = dataInputStream.readLong();
                                long j6 = dataInputStream.readLong();
                                string6 = P(dataInputStream);
                                boolean z11 = dataInputStream.readBoolean();
                                z2 = dataInputStream.readBoolean();
                                string7 = P(dataInputStream);
                                z5 = i12 > 0 ? dataInputStream.readBoolean() : true;
                                if (i12 >= 3) {
                                    String strP6 = P(dataInputStream);
                                    if (strP6 == null || strP6.length() <= 0) {
                                        str8 = strP6;
                                        str7 = null;
                                    } else {
                                        String strP7 = P(dataInputStream);
                                        String strP8 = P(dataInputStream);
                                        string7 = string7;
                                        strP2 = P(dataInputStream);
                                        strP3 = P(dataInputStream);
                                        z3 = dataInputStream.readBoolean();
                                        str8 = strP6;
                                        str7 = strP7;
                                        i4 = i4;
                                        strP = strP;
                                        z5 = z5;
                                        str9 = strP8;
                                    }
                                    j2 = j6;
                                    z4 = z11;
                                    str4 = "UnityNotifications";
                                    str10 = strP4;
                                    str6 = strP5;
                                    j = j5;
                                } else {
                                    str7 = null;
                                    str8 = null;
                                }
                                str9 = null;
                                strP2 = null;
                                strP3 = null;
                                z3 = false;
                                j2 = j6;
                                z4 = z11;
                                str4 = "UnityNotifications";
                                str10 = strP4;
                                str6 = strP5;
                                j = j5;
                            } else {
                                string5 = bundle2.getString(NotificationCompat.EXTRA_TITLE);
                                String string12 = bundle2.getString(NotificationCompat.EXTRA_TEXT);
                                String string13 = bundle2.getString(UnityNotificationManager.KEY_SMALL_ICON);
                                String string14 = bundle2.getString(UnityNotificationManager.KEY_LARGE_ICON);
                                str = "UnityNotifications";
                                try {
                                    long j7 = bundle2.getLong(UnityNotificationManager.KEY_FIRE_TIME, -1L);
                                    long j8 = bundle2.getLong(UnityNotificationManager.KEY_REPEAT_INTERVAL, -1L);
                                    string6 = bundle2.getString(NotificationCompat.EXTRA_BIG_TEXT);
                                    boolean z12 = bundle2.getBoolean(NotificationCompat.EXTRA_SHOW_CHRONOMETER, false);
                                    z2 = bundle2.getBoolean(NotificationCompat.EXTRA_SHOW_WHEN, false);
                                    str6 = string13;
                                    strP = string14;
                                    string7 = bundle2.getString("data");
                                    i4 = 0;
                                    str7 = null;
                                    str8 = null;
                                    str9 = null;
                                    strP2 = null;
                                    strP3 = null;
                                    z3 = false;
                                    j = j7;
                                    j2 = j8;
                                    z4 = z12;
                                    str4 = str;
                                    str10 = string12;
                                    z5 = true;
                                } catch (Exception e11) {
                                    e = e11;
                                    str2 = UnityNotificationManager.KEY_REPEAT_INTERVAL;
                                    str3 = "data";
                                    str11 = "Failed to deserialize notification";
                                    Log.e(str, str11, e);
                                    builderCreateNotificationBuilder = null;
                                } catch (OutOfMemoryError e12) {
                                    e = e12;
                                    str2 = UnityNotificationManager.KEY_REPEAT_INTERVAL;
                                    str3 = "data";
                                    str11 = "Failed to deserialize notification";
                                    Log.e(str, str11, e);
                                    builderCreateNotificationBuilder = null;
                                }
                            }
                            try {
                                String strP9 = P(dataInputStream);
                                boolean z13 = dataInputStream.readBoolean();
                                if (z13) {
                                    try {
                                        i5 = dataInputStream.readInt();
                                    } catch (Exception e13) {
                                        e = e13;
                                        str2 = r6;
                                        str3 = r7;
                                        str = str4;
                                        Log.e(str, str11, e);
                                        builderCreateNotificationBuilder = null;
                                        if (builderCreateNotificationBuilder != null) {
                                            return builderCreateNotificationBuilder;
                                        }
                                        String str14 = "Failed to deserialize old style notification";
                                        Parcel parcelObtain2 = Parcel.obtain();
                                        parcelObtain2.unmarshall(bArr, 0, bArr.length);
                                        parcelObtain2.setDataPosition(0);
                                        Bundle bundle3 = new Bundle();
                                        bundle3.readFromParcel(parcelObtain2);
                                        int i13 = bundle3.getInt("id", -1);
                                        String string15 = bundle3.getString(UnityNotificationManager.KEY_CHANNEL_ID);
                                        String string16 = bundle3.getString("textTitle");
                                        string = bundle3.getString("textContent");
                                        String string17 = bundle3.getString("smallIconStr");
                                        boolean z14 = bundle3.getBoolean("autoCancel", false);
                                        boolean z15 = bundle3.getBoolean("usesChronometer", false);
                                        long j9 = bundle3.getLong(UnityNotificationManager.KEY_FIRE_TIME, -1L);
                                        long j10 = bundle3.getLong(str2, -1L);
                                        String str15 = str;
                                        String string18 = bundle3.getString("largeIconStr");
                                        i = bundle3.getInt("style", -1);
                                        i2 = bundle3.getInt("color", 0);
                                        i3 = bundle3.getInt("number", 0);
                                        string2 = bundle3.getString(str3);
                                        str5 = str3;
                                        string3 = bundle3.getString("group");
                                        boolean z16 = bundle3.getBoolean("groupSummary", false);
                                        string4 = bundle3.getString("sortKey");
                                        int i14 = bundle3.getInt("groupAlertBehaviour", -1);
                                        boolean z17 = bundle3.getBoolean("showTimestamp", false);
                                        builderCreateNotificationBuilder2 = UnityNotificationManager.g(context).createNotificationBuilder(string15);
                                        builderCreateNotificationBuilder2.getExtras().putInt("id", i13);
                                        builderCreateNotificationBuilder2.setContentTitle(string16);
                                        builderCreateNotificationBuilder2.setContentText(string);
                                        UnityNotificationManager.setNotificationIcon(builderCreateNotificationBuilder2, UnityNotificationManager.KEY_SMALL_ICON, string17);
                                        builderCreateNotificationBuilder2.setAutoCancel(z14);
                                        builderCreateNotificationBuilder2.setUsesChronometer(z15);
                                        builderCreateNotificationBuilder2.getExtras().putLong(UnityNotificationManager.KEY_FIRE_TIME, j9);
                                        builderCreateNotificationBuilder2.getExtras().putLong(str2, j10);
                                        UnityNotificationManager.setNotificationIcon(builderCreateNotificationBuilder2, UnityNotificationManager.KEY_LARGE_ICON, string18);
                                        if (i == 2) {
                                            builderCreateNotificationBuilder2.setStyle(new Notification.BigTextStyle().bigText(string));
                                        }
                                        if (i2 != 0) {
                                            UnityNotificationManager.setNotificationColor(builderCreateNotificationBuilder2, i2);
                                        }
                                        if (i3 >= 0) {
                                            builderCreateNotificationBuilder2.setNumber(i3);
                                        }
                                        if (string2 != null) {
                                            builderCreateNotificationBuilder2.getExtras().putString(str5, string2);
                                        }
                                        if (string3 != null) {
                                            builderCreateNotificationBuilder2.setGroup(string3);
                                        }
                                        builderCreateNotificationBuilder2.setGroupSummary(z16);
                                        if (string4 != null) {
                                            builderCreateNotificationBuilder2.setSortKey(string4);
                                        }
                                        UnityNotificationManager.setNotificationGroupAlertBehavior(builderCreateNotificationBuilder2, i14);
                                        builderCreateNotificationBuilder2.setShowWhen(z17);
                                        builder = builderCreateNotificationBuilder2;
                                        return builder;
                                    } catch (OutOfMemoryError e14) {
                                        e = e14;
                                        str2 = r6;
                                        str3 = r7;
                                        str = str4;
                                        Log.e(str, str11, e);
                                        builderCreateNotificationBuilder = null;
                                        if (builderCreateNotificationBuilder != null) {
                                            return builderCreateNotificationBuilder;
                                        }
                                        String str16 = "Failed to deserialize old style notification";
                                        Parcel parcelObtain3 = Parcel.obtain();
                                        parcelObtain3.unmarshall(bArr, 0, bArr.length);
                                        parcelObtain3.setDataPosition(0);
                                        Bundle bundle4 = new Bundle();
                                        bundle4.readFromParcel(parcelObtain3);
                                        int i15 = bundle4.getInt("id", -1);
                                        String string19 = bundle4.getString(UnityNotificationManager.KEY_CHANNEL_ID);
                                        String string110 = bundle4.getString("textTitle");
                                        string = bundle4.getString("textContent");
                                        String string111 = bundle4.getString("smallIconStr");
                                        boolean z18 = bundle4.getBoolean("autoCancel", false);
                                        boolean z19 = bundle4.getBoolean("usesChronometer", false);
                                        long j11 = bundle4.getLong(UnityNotificationManager.KEY_FIRE_TIME, -1L);
                                        long j12 = bundle4.getLong(str2, -1L);
                                        String str17 = str;
                                        String string112 = bundle4.getString("largeIconStr");
                                        i = bundle4.getInt("style", -1);
                                        i2 = bundle4.getInt("color", 0);
                                        i3 = bundle4.getInt("number", 0);
                                        string2 = bundle4.getString(str3);
                                        str5 = str3;
                                        string3 = bundle4.getString("group");
                                        boolean z110 = bundle4.getBoolean("groupSummary", false);
                                        string4 = bundle4.getString("sortKey");
                                        int i16 = bundle4.getInt("groupAlertBehaviour", -1);
                                        boolean z111 = bundle4.getBoolean("showTimestamp", false);
                                        builderCreateNotificationBuilder2 = UnityNotificationManager.g(context).createNotificationBuilder(string19);
                                        builderCreateNotificationBuilder2.getExtras().putInt("id", i15);
                                        builderCreateNotificationBuilder2.setContentTitle(string110);
                                        builderCreateNotificationBuilder2.setContentText(string);
                                        UnityNotificationManager.setNotificationIcon(builderCreateNotificationBuilder2, UnityNotificationManager.KEY_SMALL_ICON, string111);
                                        builderCreateNotificationBuilder2.setAutoCancel(z18);
                                        builderCreateNotificationBuilder2.setUsesChronometer(z19);
                                        builderCreateNotificationBuilder2.getExtras().putLong(UnityNotificationManager.KEY_FIRE_TIME, j11);
                                        builderCreateNotificationBuilder2.getExtras().putLong(str2, j12);
                                        UnityNotificationManager.setNotificationIcon(builderCreateNotificationBuilder2, UnityNotificationManager.KEY_LARGE_ICON, string112);
                                        if (i == 2) {
                                            builderCreateNotificationBuilder2.setStyle(new Notification.BigTextStyle().bigText(string));
                                        }
                                        if (i2 != 0) {
                                            UnityNotificationManager.setNotificationColor(builderCreateNotificationBuilder2, i2);
                                        }
                                        if (i3 >= 0) {
                                            builderCreateNotificationBuilder2.setNumber(i3);
                                        }
                                        if (string2 != null) {
                                            builderCreateNotificationBuilder2.getExtras().putString(str5, string2);
                                        }
                                        if (string3 != null) {
                                            builderCreateNotificationBuilder2.setGroup(string3);
                                        }
                                        builderCreateNotificationBuilder2.setGroupSummary(z110);
                                        if (string4 != null) {
                                            builderCreateNotificationBuilder2.setSortKey(string4);
                                        }
                                        UnityNotificationManager.setNotificationGroupAlertBehavior(builderCreateNotificationBuilder2, i16);
                                        builderCreateNotificationBuilder2.setShowWhen(z111);
                                        builder = builderCreateNotificationBuilder2;
                                        return builder;
                                    }
                                } else {
                                    i5 = 0;
                                }
                                String str18 = string5;
                                int i17 = dataInputStream.readInt();
                                boolean z20 = dataInputStream.readBoolean();
                                String strP10 = P(dataInputStream);
                                boolean z21 = dataInputStream.readBoolean();
                                int i18 = dataInputStream.readInt();
                                String strP11 = P(dataInputStream);
                                long j13 = z2 ? dataInputStream.readLong() : 0L;
                                UnityNotificationManager unityNotificationManagerG = UnityNotificationManager.g(context);
                                builderCreateNotificationBuilder = unityNotificationManagerG.createNotificationBuilder(strP9);
                                if (bundle2 != null) {
                                    builderCreateNotificationBuilder.setExtras(bundle2);
                                    str2 = UnityNotificationManager.KEY_REPEAT_INTERVAL;
                                    str3 = "data";
                                } else {
                                    builderCreateNotificationBuilder.getExtras().putInt("id", i4);
                                    UnityNotificationManager.setNotificationIcon(builderCreateNotificationBuilder, UnityNotificationManager.KEY_SMALL_ICON, str6);
                                    UnityNotificationManager.setNotificationIcon(builderCreateNotificationBuilder, UnityNotificationManager.KEY_LARGE_ICON, strP);
                                    if (j != -1) {
                                        builderCreateNotificationBuilder.getExtras().putLong(UnityNotificationManager.KEY_FIRE_TIME, j);
                                    }
                                    if (j2 != -1) {
                                        try {
                                            str2 = r6;
                                            try {
                                                builderCreateNotificationBuilder.getExtras().putLong(str2, j2);
                                            } catch (Exception e15) {
                                                e = e15;
                                                str3 = r7;
                                                str = str4;
                                                Log.e(str, str11, e);
                                                builderCreateNotificationBuilder = null;
                                            } catch (OutOfMemoryError e16) {
                                                e = e16;
                                                str3 = r7;
                                                str = str4;
                                                Log.e(str, str11, e);
                                                builderCreateNotificationBuilder = null;
                                            }
                                        } catch (Exception e17) {
                                            e = e17;
                                            str2 = r6;
                                        } catch (OutOfMemoryError e18) {
                                            e = e18;
                                            str2 = r6;
                                        }
                                    } else {
                                        str2 = r6;
                                    }
                                    if (string7 != null) {
                                        try {
                                            str3 = r7;
                                            try {
                                                builderCreateNotificationBuilder.getExtras().putString(str3, string7);
                                            } catch (Exception e19) {
                                                e = e19;
                                                str11 = str11;
                                                str = str4;
                                                Log.e(str, str11, e);
                                                builderCreateNotificationBuilder = null;
                                            } catch (OutOfMemoryError e20) {
                                                e = e20;
                                                str11 = str11;
                                                str = str4;
                                                Log.e(str, str11, e);
                                                builderCreateNotificationBuilder = null;
                                            }
                                        } catch (Exception e21) {
                                            e = e21;
                                            str3 = r7;
                                            str11 = str11;
                                            str = str4;
                                            Log.e(str, str11, e);
                                            builderCreateNotificationBuilder = null;
                                        } catch (OutOfMemoryError e22) {
                                            e = e22;
                                            str3 = r7;
                                            str11 = str11;
                                            str = str4;
                                            Log.e(str, str11, e);
                                            builderCreateNotificationBuilder = null;
                                        }
                                    } else {
                                        str3 = r7;
                                    }
                                    builderCreateNotificationBuilder.getExtras().putBoolean(UnityNotificationManager.KEY_SHOW_IN_FOREGROUND, z5);
                                }
                                if (str18 != null) {
                                    builderCreateNotificationBuilder.setContentTitle(str18);
                                }
                                if (str10 != null) {
                                    builderCreateNotificationBuilder.setContentText(str10);
                                }
                                if (string6 != null) {
                                    builderCreateNotificationBuilder.setStyle(new Notification.BigTextStyle().bigText(string6));
                                } else if (str8 != null) {
                                    unityNotificationManagerG.setupBigPictureStyle(builderCreateNotificationBuilder, str7, str8, str9, strP2, strP3, z3);
                                }
                                if (z13) {
                                    UnityNotificationManager.setNotificationColor(builderCreateNotificationBuilder, i5);
                                }
                                if (i17 >= 0) {
                                    builderCreateNotificationBuilder.setNumber(i17);
                                }
                                builderCreateNotificationBuilder.setAutoCancel(z20);
                                UnityNotificationManager.setNotificationUsesChronometer(builderCreateNotificationBuilder, z4);
                                if (strP10 != null && strP10.length() > 0) {
                                    builderCreateNotificationBuilder.setGroup(strP10);
                                }
                                builderCreateNotificationBuilder.setGroupSummary(z21);
                                UnityNotificationManager.setNotificationGroupAlertBehavior(builderCreateNotificationBuilder, i18);
                                if (strP11 != null && strP11.length() > 0) {
                                    builderCreateNotificationBuilder.setSortKey(strP11);
                                }
                                if (z2) {
                                    builderCreateNotificationBuilder.setShowWhen(true);
                                    builderCreateNotificationBuilder.setWhen(j13);
                                }
                                str = str4;
                            } catch (Exception e23) {
                                e = e23;
                                str2 = r6;
                            } catch (OutOfMemoryError e24) {
                                e = e24;
                                str2 = r6;
                            }
                        }
                    } catch (Exception e25) {
                        e = e25;
                        str11 = "Failed to deserialize notification";
                        str4 = "UnityNotifications";
                        str2 = UnityNotificationManager.KEY_REPEAT_INTERVAL;
                        str3 = "data";
                    }
                    if (builderCreateNotificationBuilder != null) {
                        return builderCreateNotificationBuilder;
                    }
                    String str19 = "Failed to deserialize old style notification";
                    Parcel parcelObtain4 = Parcel.obtain();
                    parcelObtain4.unmarshall(bArr, 0, bArr.length);
                    parcelObtain4.setDataPosition(0);
                    Bundle bundle5 = new Bundle();
                    bundle5.readFromParcel(parcelObtain4);
                    int i19 = bundle5.getInt("id", -1);
                    String string113 = bundle5.getString(UnityNotificationManager.KEY_CHANNEL_ID);
                    String string114 = bundle5.getString("textTitle");
                    string = bundle5.getString("textContent");
                    String string115 = bundle5.getString("smallIconStr");
                    boolean z112 = bundle5.getBoolean("autoCancel", false);
                    boolean z113 = bundle5.getBoolean("usesChronometer", false);
                    long j14 = bundle5.getLong(UnityNotificationManager.KEY_FIRE_TIME, -1L);
                    long j15 = bundle5.getLong(str2, -1L);
                    String str110 = str;
                    String string116 = bundle5.getString("largeIconStr");
                    i = bundle5.getInt("style", -1);
                    i2 = bundle5.getInt("color", 0);
                    i3 = bundle5.getInt("number", 0);
                    string2 = bundle5.getString(str3);
                    str5 = str3;
                    string3 = bundle5.getString("group");
                    boolean z114 = bundle5.getBoolean("groupSummary", false);
                    string4 = bundle5.getString("sortKey");
                    int i110 = bundle5.getInt("groupAlertBehaviour", -1);
                    boolean z115 = bundle5.getBoolean("showTimestamp", false);
                    builderCreateNotificationBuilder2 = UnityNotificationManager.g(context).createNotificationBuilder(string113);
                    builderCreateNotificationBuilder2.getExtras().putInt("id", i19);
                    builderCreateNotificationBuilder2.setContentTitle(string114);
                    builderCreateNotificationBuilder2.setContentText(string);
                    UnityNotificationManager.setNotificationIcon(builderCreateNotificationBuilder2, UnityNotificationManager.KEY_SMALL_ICON, string115);
                    builderCreateNotificationBuilder2.setAutoCancel(z112);
                    builderCreateNotificationBuilder2.setUsesChronometer(z113);
                    builderCreateNotificationBuilder2.getExtras().putLong(UnityNotificationManager.KEY_FIRE_TIME, j14);
                    builderCreateNotificationBuilder2.getExtras().putLong(str2, j15);
                    UnityNotificationManager.setNotificationIcon(builderCreateNotificationBuilder2, UnityNotificationManager.KEY_LARGE_ICON, string116);
                    if (i == 2) {
                        builderCreateNotificationBuilder2.setStyle(new Notification.BigTextStyle().bigText(string));
                    }
                    if (i2 != 0) {
                        UnityNotificationManager.setNotificationColor(builderCreateNotificationBuilder2, i2);
                    }
                    if (i3 >= 0) {
                        builderCreateNotificationBuilder2.setNumber(i3);
                    }
                    if (string2 != null) {
                        builderCreateNotificationBuilder2.getExtras().putString(str5, string2);
                    }
                    if (string3 != null && string3.length() > 0) {
                        builderCreateNotificationBuilder2.setGroup(string3);
                    }
                    builderCreateNotificationBuilder2.setGroupSummary(z114);
                    if (string4 != null && string4.length() > 0) {
                        builderCreateNotificationBuilder2.setSortKey(string4);
                    }
                    UnityNotificationManager.setNotificationGroupAlertBehavior(builderCreateNotificationBuilder2, i110);
                    builderCreateNotificationBuilder2.setShowWhen(z115);
                    builder = builderCreateNotificationBuilder2;
                    return builder;
                }
                str2 = UnityNotificationManager.KEY_REPEAT_INTERVAL;
                str3 = "data";
                str = "UnityNotifications";
            } catch (Exception e26) {
                e = e26;
                str11 = "Failed to deserialize notification";
                str = "UnityNotifications";
                str2 = UnityNotificationManager.KEY_REPEAT_INTERVAL;
                str3 = "data";
            }
        } catch (OutOfMemoryError e27) {
            e = e27;
            str11 = "Failed to deserialize notification";
            str4 = "UnityNotifications";
            str2 = UnityNotificationManager.KEY_REPEAT_INTERVAL;
            str3 = "data";
        }
        builderCreateNotificationBuilder = null;
        if (builderCreateNotificationBuilder != null) {
            return builderCreateNotificationBuilder;
        }
        String str111 = "Failed to deserialize old style notification";
        Parcel parcelObtain5 = Parcel.obtain();
        parcelObtain5.unmarshall(bArr, 0, bArr.length);
        parcelObtain5.setDataPosition(0);
        Bundle bundle6 = new Bundle();
        bundle6.readFromParcel(parcelObtain5);
        int i111 = bundle6.getInt("id", -1);
        String string117 = bundle6.getString(UnityNotificationManager.KEY_CHANNEL_ID);
        String string118 = bundle6.getString("textTitle");
        string = bundle6.getString("textContent");
        String string119 = bundle6.getString("smallIconStr");
        boolean z116 = bundle6.getBoolean("autoCancel", false);
        boolean z117 = bundle6.getBoolean("usesChronometer", false);
        long j16 = bundle6.getLong(UnityNotificationManager.KEY_FIRE_TIME, -1L);
        long j17 = bundle6.getLong(str2, -1L);
        String str112 = str;
        String string1110 = bundle6.getString("largeIconStr");
        i = bundle6.getInt("style", -1);
        i2 = bundle6.getInt("color", 0);
        i3 = bundle6.getInt("number", 0);
        string2 = bundle6.getString(str3);
        str5 = str3;
        string3 = bundle6.getString("group");
        boolean z118 = bundle6.getBoolean("groupSummary", false);
        string4 = bundle6.getString("sortKey");
        int i112 = bundle6.getInt("groupAlertBehaviour", -1);
        boolean z119 = bundle6.getBoolean("showTimestamp", false);
        builderCreateNotificationBuilder2 = UnityNotificationManager.g(context).createNotificationBuilder(string117);
        builderCreateNotificationBuilder2.getExtras().putInt("id", i111);
        builderCreateNotificationBuilder2.setContentTitle(string118);
        builderCreateNotificationBuilder2.setContentText(string);
        UnityNotificationManager.setNotificationIcon(builderCreateNotificationBuilder2, UnityNotificationManager.KEY_SMALL_ICON, string119);
        builderCreateNotificationBuilder2.setAutoCancel(z116);
        builderCreateNotificationBuilder2.setUsesChronometer(z117);
        builderCreateNotificationBuilder2.getExtras().putLong(UnityNotificationManager.KEY_FIRE_TIME, j16);
        builderCreateNotificationBuilder2.getExtras().putLong(str2, j17);
        UnityNotificationManager.setNotificationIcon(builderCreateNotificationBuilder2, UnityNotificationManager.KEY_LARGE_ICON, string1110);
        if (i == 2) {
            builderCreateNotificationBuilder2.setStyle(new Notification.BigTextStyle().bigText(string));
        }
        if (i2 != 0) {
            UnityNotificationManager.setNotificationColor(builderCreateNotificationBuilder2, i2);
        }
        if (i3 >= 0) {
            builderCreateNotificationBuilder2.setNumber(i3);
        }
        if (string2 != null) {
            builderCreateNotificationBuilder2.getExtras().putString(str5, string2);
        }
        if (string3 != null) {
            builderCreateNotificationBuilder2.setGroup(string3);
        }
        builderCreateNotificationBuilder2.setGroupSummary(z118);
        if (string4 != null) {
            builderCreateNotificationBuilder2.setSortKey(string4);
        }
        UnityNotificationManager.setNotificationGroupAlertBehavior(builderCreateNotificationBuilder2, i112);
        builderCreateNotificationBuilder2.setShowWhen(z119);
        builder = builderCreateNotificationBuilder2;
        return builder;
    }

    public static Parcelable O(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        if (i > 0) {
            byte[] bArr = new byte[i];
            if (dataInputStream.read(bArr) != i) {
                dr0.h("Insufficient amount of bytes read");
                return null;
            }
            try {
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.unmarshall(bArr, 0, i);
                parcelObtain.setDataPosition(0);
                Bundle bundle = (Bundle) parcelObtain.readParcelable(wz2.class.getClassLoader());
                parcelObtain.recycle();
                if (bundle != null) {
                    return bundle.getParcelable("obj");
                }
            } catch (Exception e) {
                Log.e("UnityNotifications", "Failed to deserialize parcelable", e);
            } catch (OutOfMemoryError e2) {
                Log.e("UnityNotifications", "Failed to deserialize parcelable", e2);
            }
        }
        return null;
    }

    public static Class R(Context context) {
        try {
            try {
                PackageManager packageManager = context.getPackageManager();
                Bundle bundle = packageManager.getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle.containsKey("custom_notification_android_activity")) {
                    try {
                        return Class.forName(bundle.getString("custom_notification_android_activity"));
                    } catch (ClassNotFoundException e) {
                        Log.e("UnityNotifications", "Specified activity class for notifications not found: " + e.getMessage());
                    }
                }
                Log.w("UnityNotifications", "No custom_notification_android_activity found, attempting to find app activity class");
                boolean z = true;
                ActivityInfo[] activityInfoArr = packageManager.getPackageInfo(context.getPackageName(), 1).activities;
                if (activityInfoArr == null) {
                    Log.e("UnityNotifications", "Could not get package activities");
                    return null;
                }
                int length = activityInfoArr.length;
                String str = null;
                int i = 0;
                boolean z2 = false;
                boolean z3 = false;
                while (true) {
                    if (i >= length) {
                        z = z3;
                        break;
                    }
                    ActivityInfo activityInfo = activityInfoArr[i];
                    if (activityInfo.enabled && activityInfo.targetActivity == null) {
                        String str2 = activityInfo.name;
                        boolean z4 = str2.endsWith(".UnityPlayerActivity") || str2.endsWith(".UnityPlayerGameActivity");
                        if (str == null) {
                            str = activityInfo.name;
                        } else if (z2 == z4) {
                            if (z2 && z4) {
                                break;
                            }
                            z3 = true;
                        } else if (z4) {
                            str = activityInfo.name;
                            z3 = false;
                        }
                        z2 = z4;
                    }
                    i++;
                }
                if (z) {
                    Log.e("UnityNotifications", "Multiple choices for activity for notifications, set activity explicitly in Notification Settings");
                    return null;
                }
                if (str != null) {
                    return Class.forName(str);
                }
                Log.e("UnityNotifications", "Activity class for notifications not found");
                return null;
            } catch (ClassNotFoundException e2) {
                Log.e("UnityNotifications", "Failed to find activity class: " + e2.getMessage());
                return null;
            }
        } catch (PackageManager.NameNotFoundException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0065  */
    /* JADX WARN: Code duplicated, block: B:19:0x0067  */
    /* JADX WARN: Code duplicated, block: B:22:0x006f  */
    /* JADX WARN: Code duplicated, block: B:25:0x007c  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c7  */
    public static Notification.Builder S(Context context, Notification notification) {
        Notification.Builder builderCreateNotificationBuilder;
        String string;
        boolean z;
        int i;
        String string2;
        String group;
        String sortKey;
        Integer notificationColor;
        String string3;
        try {
            Notification.Builder builderRecoverBuilder = Notification.Builder.recoverBuilder(context, notification);
            builderRecoverBuilder.setExtras(notification.extras);
            return builderRecoverBuilder;
        } catch (Exception e) {
            Log.e("UnityNotifications", "Failed to recover builder for notification!", e);
            builderCreateNotificationBuilder = UnityNotificationManager.g(context).createNotificationBuilder(notification.extras.getString(UnityNotificationManager.KEY_CHANNEL_ID));
            UnityNotificationManager.setNotificationIcon(builderCreateNotificationBuilder, UnityNotificationManager.KEY_SMALL_ICON, notification.extras.getString(UnityNotificationManager.KEY_SMALL_ICON));
            string = notification.extras.getString(UnityNotificationManager.KEY_LARGE_ICON);
            if (string != null && !string.isEmpty()) {
                UnityNotificationManager.setNotificationIcon(builderCreateNotificationBuilder, UnityNotificationManager.KEY_LARGE_ICON, string);
            }
            builderCreateNotificationBuilder.setContentTitle(notification.extras.getString(NotificationCompat.EXTRA_TITLE));
            builderCreateNotificationBuilder.setContentText(notification.extras.getString(NotificationCompat.EXTRA_TEXT));
            if ((notification.flags & 16) != 0) {
                z = true;
            } else {
                z = false;
            }
            builderCreateNotificationBuilder.setAutoCancel(z);
            i = notification.number;
            if (i >= 0) {
                builderCreateNotificationBuilder.setNumber(i);
            }
            string2 = notification.extras.getString(NotificationCompat.EXTRA_BIG_TEXT);
            if (string2 != null) {
                builderCreateNotificationBuilder.setStyle(new Notification.BigTextStyle().bigText(string2));
            }
            builderCreateNotificationBuilder.setWhen(notification.when);
            group = notification.getGroup();
            if (group != null && !group.isEmpty()) {
                builderCreateNotificationBuilder.setGroup(group);
            }
            builderCreateNotificationBuilder.setGroupSummary((notification.flags & 512) != 0);
            sortKey = notification.getSortKey();
            if (sortKey != null && !sortKey.isEmpty()) {
                builderCreateNotificationBuilder.setSortKey(sortKey);
            }
            builderCreateNotificationBuilder.setShowWhen(notification.extras.getBoolean(NotificationCompat.EXTRA_SHOW_WHEN, false));
            notificationColor = UnityNotificationManager.getNotificationColor(notification);
            if (notificationColor != null) {
                UnityNotificationManager.setNotificationColor(builderCreateNotificationBuilder, notificationColor.intValue());
            }
            UnityNotificationManager.setNotificationUsesChronometer(builderCreateNotificationBuilder, notification.extras.getBoolean(NotificationCompat.EXTRA_SHOW_CHRONOMETER, false));
            UnityNotificationManager.setNotificationGroupAlertBehavior(builderCreateNotificationBuilder, UnityNotificationManager.getNotificationGroupAlertBehavior(notification));
            builderCreateNotificationBuilder.getExtras().putInt("id", notification.extras.getInt("id", 0));
            builderCreateNotificationBuilder.getExtras().putLong(UnityNotificationManager.KEY_REPEAT_INTERVAL, notification.extras.getLong(UnityNotificationManager.KEY_REPEAT_INTERVAL, 0L));
            builderCreateNotificationBuilder.getExtras().putLong(UnityNotificationManager.KEY_FIRE_TIME, notification.extras.getLong(UnityNotificationManager.KEY_FIRE_TIME, 0L));
            string3 = notification.extras.getString("data");
            if (string3 != null && !string3.isEmpty()) {
                builderCreateNotificationBuilder.getExtras().putString("data", string3);
            }
            return builderCreateNotificationBuilder;
        } catch (OutOfMemoryError e2) {
            Log.e("UnityNotifications", "Failed to recover builder for notification!", e2);
            builderCreateNotificationBuilder = UnityNotificationManager.g(context).createNotificationBuilder(notification.extras.getString(UnityNotificationManager.KEY_CHANNEL_ID));
            UnityNotificationManager.setNotificationIcon(builderCreateNotificationBuilder, UnityNotificationManager.KEY_SMALL_ICON, notification.extras.getString(UnityNotificationManager.KEY_SMALL_ICON));
            string = notification.extras.getString(UnityNotificationManager.KEY_LARGE_ICON);
            if (string != null) {
                UnityNotificationManager.setNotificationIcon(builderCreateNotificationBuilder, UnityNotificationManager.KEY_LARGE_ICON, string);
            }
            builderCreateNotificationBuilder.setContentTitle(notification.extras.getString(NotificationCompat.EXTRA_TITLE));
            builderCreateNotificationBuilder.setContentText(notification.extras.getString(NotificationCompat.EXTRA_TEXT));
            if ((notification.flags & 16) != 0) {
                z = true;
            } else {
                z = false;
            }
            builderCreateNotificationBuilder.setAutoCancel(z);
            i = notification.number;
            if (i >= 0) {
                builderCreateNotificationBuilder.setNumber(i);
            }
            string2 = notification.extras.getString(NotificationCompat.EXTRA_BIG_TEXT);
            if (string2 != null) {
                builderCreateNotificationBuilder.setStyle(new Notification.BigTextStyle().bigText(string2));
            }
            builderCreateNotificationBuilder.setWhen(notification.when);
            group = notification.getGroup();
            if (group != null) {
                builderCreateNotificationBuilder.setGroup(group);
            }
            builderCreateNotificationBuilder.setGroupSummary((notification.flags & 512) != 0);
            sortKey = notification.getSortKey();
            if (sortKey != null) {
                builderCreateNotificationBuilder.setSortKey(sortKey);
            }
            builderCreateNotificationBuilder.setShowWhen(notification.extras.getBoolean(NotificationCompat.EXTRA_SHOW_WHEN, false));
            notificationColor = UnityNotificationManager.getNotificationColor(notification);
            if (notificationColor != null) {
                UnityNotificationManager.setNotificationColor(builderCreateNotificationBuilder, notificationColor.intValue());
            }
            UnityNotificationManager.setNotificationUsesChronometer(builderCreateNotificationBuilder, notification.extras.getBoolean(NotificationCompat.EXTRA_SHOW_CHRONOMETER, false));
            UnityNotificationManager.setNotificationGroupAlertBehavior(builderCreateNotificationBuilder, UnityNotificationManager.getNotificationGroupAlertBehavior(notification));
            builderCreateNotificationBuilder.getExtras().putInt("id", notification.extras.getInt("id", 0));
            builderCreateNotificationBuilder.getExtras().putLong(UnityNotificationManager.KEY_REPEAT_INTERVAL, notification.extras.getLong(UnityNotificationManager.KEY_REPEAT_INTERVAL, 0L));
            builderCreateNotificationBuilder.getExtras().putLong(UnityNotificationManager.KEY_FIRE_TIME, notification.extras.getLong(UnityNotificationManager.KEY_FIRE_TIME, 0L));
            string3 = notification.extras.getString("data");
            if (string3 != null) {
                builderCreateNotificationBuilder.getExtras().putString("data", string3);
            }
            return builderCreateNotificationBuilder;
        }
    }

    public static final Object T(Object obj) {
        return obj instanceof kv ? J(((kv) obj).a) : obj;
    }

    public static void U(SharedPreferences sharedPreferences, Notification notification, boolean z) {
        String strEncodeToString;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            if (z) {
                Intent intent = new Intent();
                intent.putExtra(UnityNotificationManager.KEY_NOTIFICATION, notification);
                try {
                    byte[] bArrW = W(intent);
                    if (bArrW != null && bArrW.length != 0) {
                        dataOutputStream.write(b);
                        dataOutputStream.writeInt(0);
                        dataOutputStream.writeInt(bArrW.length);
                        dataOutputStream.write(bArrW);
                        dataOutputStream.close();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        strEncodeToString = Base64.encodeToString(byteArray, 0, byteArray.length, 0);
                    }
                    return;
                } catch (Exception e) {
                    Log.e("UnityNotifications", "Failed to serialize notification as Parcel", e);
                    return;
                } catch (OutOfMemoryError e2) {
                    Log.e("UnityNotifications", "Failed to serialize notification as Parcel", e2);
                    return;
                }
            }
            if (!V(notification, dataOutputStream)) {
                return;
            }
            dataOutputStream.flush();
            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
            strEncodeToString = Base64.encodeToString(byteArray2, 0, byteArray2.length, 0);
            SharedPreferences.Editor editorClear = sharedPreferences.edit().clear();
            editorClear.putString("data", strEncodeToString);
            editorClear.apply();
        } catch (Exception e3) {
            Log.e("UnityNotifications", "Failed to serialize notification", e3);
        }
    }

    public static byte[] W(Intent intent) {
        try {
            Parcel parcelObtain = Parcel.obtain();
            Bundle bundle = new Bundle();
            bundle.putParcelable("obj", intent);
            parcelObtain.writeParcelable(bundle, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            return bArrMarshall;
        } catch (Exception e) {
            Log.e("UnityNotifications", "Failed to serialize Parcelable", e);
            return null;
        } catch (OutOfMemoryError e2) {
            Log.e("UnityNotifications", "Failed to serialize Parcelable", e2);
            return null;
        }
    }

    public static void X(DataOutputStream dataOutputStream, String str) throws IOException {
        if (str == null || str.length() == 0) {
            dataOutputStream.writeInt(0);
            return;
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        dataOutputStream.writeInt(bytes.length);
        dataOutputStream.write(bytes);
    }

    public static final long Y(String str, long j, long j2, long j3) {
        String property;
        int i = fm2.a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lN = kk2.N(property);
        if (lN == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lN.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        StringBuilder sb = new StringBuilder("System property '");
        sb.append(str);
        sb.append("' should be in range ");
        sb.append(j2);
        n30.x(sb, "..", j3, ", but is '");
        sb.append(jLongValue);
        sb.append('\'');
        throw new IllegalStateException(sb.toString().toString());
    }

    public static int Z(int i, int i2, String str) {
        return (int) Y(str, i, 1L, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final void a0(Object obj) {
        if (obj instanceof j52) {
            throw ((j52) obj).a;
        }
    }

    public static boolean d0(zzagp zzagpVar, boolean z) {
        int i;
        zzey zzeyVar = new zzey(16);
        boolean z2 = true;
        while (true) {
            zzeyVar.y(8);
            if (!zzagpVar.d(zzeyVar.a, 0, 8, true)) {
                break;
            }
            long jP = zzeyVar.P();
            int iB = zzeyVar.b();
            if (jP != 1) {
                i = 8;
            } else {
                if (!zzagpVar.d(zzeyVar.a, 8, 8, true)) {
                    break;
                }
                zzeyVar.C(16);
                jP = zzeyVar.j();
                i = 16;
            }
            long j = i;
            if (jP < j) {
                break;
            }
            int i2 = (int) (jP - j);
            if (z2) {
                if (iB != 1718909296 || i2 < 8) {
                    break;
                }
                zzeyVar.y(4);
                zzagpVar.f(0, 4, zzeyVar.a);
                if (zzeyVar.b() != 1751476579) {
                    break;
                }
                if (!z) {
                    return true;
                }
                zzagpVar.b(i2 - 4);
                z2 = false;
            } else {
                if (iB == 1836086884) {
                    return true;
                }
                if (i2 != 0) {
                    zzagpVar.b(i2);
                }
                z2 = false;
            }
        }
        return false;
    }

    public void L() {
        throw new ba2(p32.a(getClass()) + " can't retrieve untyped values");
    }

    public static final void I(Long l, long j, vy0 vy0Var) {
        vy0Var.getClass();
        if (l != null && l.longValue() >= 0) {
            vy0 vy0Var2 = vy0.b;
            if (vy0Var.equals(vy0.d) || l.longValue() == j) {
                return;
            }
            throw new IllegalStateException(("Content-Length mismatch: expected " + l + " bytes, but received " + j + " bytes").toString());
        }
    }

    public static final j52 J(Throwable th) {
        th.getClass();
        return new j52(th);
    }

    public static String P(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        if (i <= 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        if (dataInputStream.read(bArr) == i) {
            return new String(bArr, StandardCharsets.UTF_8);
        }
        dr0.h("Insufficient amount of bytes read");
        return null;
    }

    public static final Throwable b0(Throwable th) {
        th.getClass();
        Throwable cause = th;
        while (cause instanceof CancellationException) {
            CancellationException cancellationException = (CancellationException) cause;
            if (!cause.equals(cancellationException.getCause())) {
                cause = cancellationException.getCause();
            } else {
                return th;
            }
        }
        if (cause == null) {
            return th;
        }
        return cause;
    }

    public static boolean e0(Comparator comparator, Collection collection) {
        Object objComparator;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            objComparator = ((SortedSet) collection).comparator();
            if (objComparator == null) {
                objComparator = qw4.a;
            }
        } else if (collection instanceof zzhl) {
            objComparator = ((zzhl) collection).c;
        } else {
            return false;
        }
        return comparator.equals(objComparator);
    }

    @Override // defpackage.hw
    public Object B(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
        serialDescriptor.getClass();
        kSerializer.getClass();
        if (!kSerializer.getDescriptor().b() && !A()) {
            return null;
        }
        return z(kSerializer);
    }

    @Override // defpackage.hw
    public double C(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return l();
    }

    public Object D(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
        serialDescriptor.getClass();
        kSerializer.getClass();
        return z(kSerializer);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public hw b(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return this;
    }

    public void c(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
    }

    @Override // defpackage.hw
    public Decoder e(ry1 ry1Var, int i) {
        ry1Var.getClass();
        return u(ry1Var.d(i));
    }

    @Override // defpackage.hw
    public long f(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return i();
    }

    @Override // defpackage.hw
    public byte g(ry1 ry1Var, int i) {
        ry1Var.getClass();
        return E();
    }

    @Override // defpackage.hw
    public int h(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return s();
    }

    @Override // defpackage.hw
    public String j(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return o();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public double l() {
        L();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public char m() {
        L();
        throw null;
    }

    @Override // defpackage.hw
    public short n(ry1 ry1Var, int i) {
        ry1Var.getClass();
        return k();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public String o() {
        L();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public int p(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        L();
        throw null;
    }

    @Override // defpackage.hw
    public char q(ry1 ry1Var, int i) {
        ry1Var.getClass();
        return m();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Decoder u(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return this;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public float v() {
        L();
        throw null;
    }

    @Override // defpackage.hw
    public float w(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return v();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean x() {
        L();
        throw null;
    }

    @Override // defpackage.hw
    public boolean y(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return x();
    }
}
