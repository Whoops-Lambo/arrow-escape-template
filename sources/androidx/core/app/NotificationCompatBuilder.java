package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.ArraySet;
import androidx.core.graphics.drawable.IconCompat;
import com.ecffri.arrows.R;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@RestrictTo
class NotificationCompatBuilder implements NotificationBuilderWithBuilderAccessor {
    public final Context a;
    public final Notification.Builder b;
    public final NotificationCompat.Builder c;
    public final Bundle d;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api20Impl {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api21Impl {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api23Impl {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api24Impl {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api26Impl {
        public static void d(Notification.Builder builder) {
            builder.setGroupAlertBehavior(0);
        }

        public static void e(Notification.Builder builder) {
            builder.setSettingsText(null);
        }

        public static void f(Notification.Builder builder) {
            builder.setShortcutId(null);
        }

        public static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        public static void g(Notification.Builder builder) {
            builder.setTimeoutAfter(0L);
        }

        public static void b(Notification.Builder builder, int i) {
            builder.setBadgeIconType(i);
        }

        public static void c(Notification.Builder builder, boolean z) {
            builder.setColorized(z);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api28Impl {
        public static void a(Notification.Builder builder, android.app.Person person) {
            builder.addPerson(person);
        }

        public static void b(Notification.Action.Builder builder, int i) {
            builder.setSemanticAction(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api29Impl {
        public static void b(Notification.Builder builder) {
            builder.setBubbleMetadata(null);
        }

        public static void a(Notification.Builder builder, boolean z) {
            builder.setAllowSystemGeneratedContextualActions(z);
        }

        public static void c(Notification.Action.Builder builder, boolean z) {
            builder.setContextual(z);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api31Impl {
        public static void a(Notification.Action.Builder builder, boolean z) {
            builder.setAuthenticationRequired(z);
        }

        public static void b(Notification.Builder builder, int i) {
            builder.setForegroundServiceBehavior(i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:137:0x0461  */
    public NotificationCompatBuilder(NotificationCompat.Builder builder) {
        int i;
        int i2;
        Bundle[] bundleArr;
        int i3;
        ArrayList arrayList;
        new ArrayList();
        this.d = new Bundle();
        this.c = builder;
        Context context = builder.a;
        ArrayList arrayList2 = builder.C;
        ArrayList arrayList3 = builder.c;
        ArrayList arrayList4 = builder.d;
        this.a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.b = Api26Impl.a(context, builder.x);
        } else {
            this.b = new Notification.Builder(context);
        }
        Notification notification = builder.B;
        Resources resources = null;
        this.b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(builder.e).setContentText(builder.f).setContentInfo(null).setContentIntent(builder.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(0).setProgress(builder.n, builder.o, builder.p);
        Notification.Builder builder2 = this.b;
        IconCompat iconCompat = builder.h;
        builder2.setLargeIcon(iconCompat == null ? null : iconCompat.h(context));
        this.b.setSubText(builder.m).setUsesChronometer(builder.k).setPriority(builder.i);
        NotificationCompat.Style style = builder.l;
        if (style instanceof NotificationCompat.CallStyle) {
            NotificationCompat.CallStyle callStyle = (NotificationCompat.CallStyle) style;
            int color = callStyle.a.a.getColor(R.color.call_notification_decline_color);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) callStyle.a.a.getResources().getString(R.string.call_notification_hang_up_action));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(color), 0, spannableStringBuilder.length(), 18);
            Context context2 = callStyle.a.a;
            PorterDuff.Mode mode = IconCompat.k;
            context2.getClass();
            NotificationCompat.Action.Builder builder3 = new NotificationCompat.Action.Builder(IconCompat.d(context2.getResources(), context2.getPackageName(), R.drawable.ic_call_decline), spannableStringBuilder);
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            if (!arrayList5.isEmpty()) {
            }
            NotificationCompat.Action action = new NotificationCompat.Action(builder3.a, builder3.b, (PendingIntent) null, builder3.d, arrayList6.isEmpty() ? null : (RemoteInput[]) arrayList6.toArray(new RemoteInput[arrayList6.size()]), builder3.c, 0, builder3.e, false, false);
            action.a.putBoolean("key_action_priority", true);
            ArrayList arrayList7 = new ArrayList(3);
            arrayList7.add(action);
            ArrayList arrayList8 = callStyle.a.b;
            if (arrayList8 != null) {
                int size = arrayList8.size();
                int i4 = 0;
                int i5 = 2;
                while (i4 < size) {
                    Object obj = arrayList8.get(i4);
                    i4++;
                    NotificationCompat.Action action2 = (NotificationCompat.Action) obj;
                    if (action2.g) {
                        arrayList7.add(action2);
                    } else if (!action2.a.getBoolean("key_action_priority") && i5 > 1) {
                        arrayList7.add(action2);
                        i5--;
                    }
                }
            }
            int size2 = arrayList7.size();
            int i6 = 0;
            while (i6 < size2) {
                Object obj2 = arrayList7.get(i6);
                i6++;
                b((NotificationCompat.Action) obj2);
            }
        } else {
            ArrayList arrayList9 = builder.b;
            int size3 = arrayList9.size();
            int i7 = 0;
            while (i7 < size3) {
                Object obj3 = arrayList9.get(i7);
                i7++;
                b((NotificationCompat.Action) obj3);
            }
        }
        Bundle bundle = builder.u;
        if (bundle != null) {
            this.d.putAll(bundle);
        }
        this.b.setShowWhen(builder.j);
        this.b.setLocalOnly(builder.r);
        this.b.setGroup(builder.q);
        this.b.setSortKey(null);
        this.b.setGroupSummary(false);
        this.b.setCategory(null);
        this.b.setColor(builder.v);
        this.b.setVisibility(builder.w);
        this.b.setPublicVersion(null);
        this.b.setSound(notification.sound, notification.audioAttributes);
        String str = "";
        if (Build.VERSION.SDK_INT < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList3.size());
                int size4 = arrayList3.size();
                int i8 = 0;
                while (i8 < size4) {
                    Object obj4 = arrayList3.get(i8);
                    i8++;
                    Person person = (Person) obj4;
                    CharSequence charSequence = person.a;
                    String str2 = person.c;
                    if (str2 == null) {
                        if (charSequence != null) {
                            str2 = "name:" + ((Object) charSequence);
                        } else {
                            str2 = "";
                        }
                    }
                    arrayList.add(str2);
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    ArraySet arraySet = new ArraySet(arrayList2.size() + arrayList.size());
                    arraySet.addAll(arrayList);
                    arraySet.addAll(arrayList2);
                    arrayList2 = new ArrayList(arraySet);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size5 = arrayList2.size();
            int i9 = 0;
            while (i9 < size5) {
                Object obj5 = arrayList2.get(i9);
                i9++;
                this.b.addPerson((String) obj5);
            }
        }
        if (arrayList4.size() > 0) {
            if (builder.u == null) {
                builder.u = new Bundle();
            }
            Bundle bundle2 = builder.u.getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            int i10 = 0;
            while (i10 < arrayList4.size()) {
                String string = Integer.toString(i10);
                NotificationCompat.Action action3 = (NotificationCompat.Action) arrayList4.get(i10);
                Bundle bundle5 = new Bundle();
                if (action3.b == null && (i3 = action3.h) != 0) {
                    action3.b = IconCompat.d(resources, str, i3);
                }
                IconCompat iconCompat2 = action3.b;
                Bundle bundle6 = action3.a;
                bundle5.putInt("icon", iconCompat2 != null ? iconCompat2.e() : 0);
                bundle5.putCharSequence("title", action3.i);
                bundle5.putParcelable("actionIntent", action3.j);
                Bundle bundle7 = bundle6 != null ? new Bundle(bundle6) : new Bundle();
                bundle7.putBoolean("android.support.allowGeneratedReplies", action3.d);
                bundle5.putBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS, bundle7);
                RemoteInput[] remoteInputArr = action3.c;
                if (remoteInputArr == null) {
                    bundleArr = null;
                } else {
                    bundleArr = new Bundle[remoteInputArr.length];
                    int i11 = 0;
                    while (i11 < remoteInputArr.length) {
                        RemoteInput remoteInput = remoteInputArr[i11];
                        int i12 = i11;
                        Bundle bundle8 = new Bundle();
                        RemoteInput[] remoteInputArr2 = remoteInputArr;
                        int i13 = i10;
                        bundle8.putString("resultKey", remoteInput.a);
                        bundle8.putCharSequence("label", remoteInput.b);
                        bundle8.putCharSequenceArray("choices", remoteInput.c);
                        bundle8.putBoolean("allowFreeFormInput", remoteInput.d);
                        bundle8.putBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS, remoteInput.f);
                        Set set = remoteInput.g;
                        if (set != null && !set.isEmpty()) {
                            ArrayList<String> arrayList10 = new ArrayList<>(set.size());
                            Iterator it = set.iterator();
                            while (it.hasNext()) {
                                arrayList10.add((String) it.next());
                            }
                            bundle8.putStringArrayList("allowedDataTypes", arrayList10);
                        }
                        bundleArr[i12] = bundle8;
                        i11 = i12 + 1;
                        remoteInputArr = remoteInputArr2;
                        i10 = i13;
                    }
                }
                int i14 = i10;
                bundle5.putParcelableArray("remoteInputs", bundleArr);
                bundle5.putBoolean("showsUserInterface", action3.e);
                bundle5.putInt("semanticAction", action3.f);
                bundle4.putBundle(string, bundle5);
                i10 = i14 + 1;
                arrayList4 = arrayList4;
                str = str;
                resources = null;
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            if (builder.u == null) {
                builder.u = new Bundle();
            }
            builder.u.putBundle("android.car.EXTENSIONS", bundle2);
            this.d.putBundle("android.car.EXTENSIONS", bundle3);
        }
        this.b.setExtras(builder.u);
        this.b.setRemoteInputHistory(null);
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 26) {
            Api26Impl.b(this.b, builder.y);
            Api26Impl.e(this.b);
            Api26Impl.f(this.b);
            Api26Impl.g(this.b);
            Api26Impl.d(this.b);
            if (builder.t) {
                Api26Impl.c(this.b, builder.s);
            }
            if (TextUtils.isEmpty(builder.x)) {
                i = 0;
            } else {
                i = 0;
                this.b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        } else {
            i = 0;
        }
        if (i15 >= 28) {
            int size6 = arrayList3.size();
            int i16 = i;
            while (i16 < size6) {
                Object obj6 = arrayList3.get(i16);
                i16++;
                Person person2 = (Person) obj6;
                Notification.Builder builder4 = this.b;
                person2.getClass();
                Api28Impl.a(builder4, Person.Api28Impl.b(person2));
            }
        }
        int i17 = Build.VERSION.SDK_INT;
        if (i17 >= 29) {
            Api29Impl.a(this.b, builder.A);
            Api29Impl.b(this.b);
        }
        if (i17 < 31 || (i2 = builder.z) == 0) {
            return;
        }
        Api31Impl.b(this.b, i2);
    }

    @Override // androidx.core.app.NotificationBuilderWithBuilderAccessor
    public final Notification.Builder a() {
        return this.b;
    }

    public final void b(NotificationCompat.Action action) {
        Set set;
        int i;
        if (action.b == null && (i = action.h) != 0) {
            action.b = IconCompat.d(null, "", i);
        }
        IconCompat iconCompat = action.b;
        int i2 = action.f;
        boolean z = action.d;
        Bundle bundle = action.a;
        Notification.Action.Builder builder = new Notification.Action.Builder(iconCompat != null ? iconCompat.h(null) : null, action.i, action.j);
        RemoteInput[] remoteInputArr = action.c;
        if (remoteInputArr != null) {
            android.app.RemoteInput[] remoteInputArr2 = new android.app.RemoteInput[remoteInputArr.length];
            for (int i3 = 0; i3 < remoteInputArr.length; i3++) {
                RemoteInput remoteInput = remoteInputArr[i3];
                android.app.RemoteInput.Builder builderAddExtras = new android.app.RemoteInput.Builder(remoteInput.a).setLabel(remoteInput.b).setChoices(remoteInput.c).setAllowFreeFormInput(remoteInput.d).addExtras(remoteInput.f);
                if (Build.VERSION.SDK_INT >= 26 && (set = remoteInput.g) != null) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        RemoteInput.Api26Impl.a(builderAddExtras, (String) it.next());
                    }
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    RemoteInput.Api29Impl.a(builderAddExtras, remoteInput.e);
                }
                remoteInputArr2[i3] = builderAddExtras.build();
            }
            for (android.app.RemoteInput remoteInput2 : remoteInputArr2) {
                builder.addRemoteInput(remoteInput2);
            }
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", z);
        builder.setAllowGeneratedReplies(z);
        bundle2.putInt("android.support.action.semanticAction", i2);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            Api28Impl.b(builder, i2);
        }
        if (i4 >= 29) {
            Api29Impl.c(builder, action.g);
        }
        if (i4 >= 31) {
            Api31Impl.a(builder, action.k);
        }
        bundle2.putBoolean("android.support.action.showsUserInterface", action.e);
        builder.addExtras(bundle2);
        this.b.addAction(builder.build());
    }
}
