package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.provider.FontRequest;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class DefaultEmojiCompatConfig {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RestrictTo
    public static class DefaultEmojiCompatConfigHelper {
        public ProviderInfo a(ResolveInfo resolveInfo) {
            throw new IllegalStateException("Unable to get provider info prior to API 19");
        }

        public Signature[] b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        public List c(PackageManager packageManager, Intent intent) {
            return Collections.EMPTY_LIST;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    @RestrictTo
    public static class DefaultEmojiCompatConfigHelper_API19 extends DefaultEmojiCompatConfigHelper {
        @Override // androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper
        public final List c(PackageManager packageManager, Intent intent) {
            return packageManager.queryIntentContentProviders(intent, 0);
        }

        @Override // androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper
        public final ProviderInfo a(ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    @RestrictTo
    public static class DefaultEmojiCompatConfigHelper_API28 extends DefaultEmojiCompatConfigHelper_API19 {
        @Override // androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper
        public final Signature[] b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RestrictTo
    public static class DefaultEmojiCompatConfigFactory {
        public final DefaultEmojiCompatConfigHelper a;

        public DefaultEmojiCompatConfigFactory() {
            DefaultEmojiCompatConfigHelper defaultEmojiCompatConfigHelper_API19;
            if (Build.VERSION.SDK_INT >= 28) {
                defaultEmojiCompatConfigHelper_API19 = new DefaultEmojiCompatConfigHelper_API28();
            } else {
                defaultEmojiCompatConfigHelper_API19 = new DefaultEmojiCompatConfigHelper_API19();
            }
            this.a = defaultEmojiCompatConfigHelper_API19;
        }
    }

    public static FontRequestEmojiCompatConfig a(Context context) {
        ProviderInfo providerInfoA;
        FontRequest fontRequest;
        ApplicationInfo applicationInfo;
        DefaultEmojiCompatConfigFactory defaultEmojiCompatConfigFactory = new DefaultEmojiCompatConfigFactory();
        PackageManager packageManager = context.getPackageManager();
        Preconditions.c(packageManager, "Package manager required to locate emoji font provider");
        Intent intent = new Intent("androidx.content.action.LOAD_EMOJI_FONT");
        DefaultEmojiCompatConfigHelper defaultEmojiCompatConfigHelper = defaultEmojiCompatConfigFactory.a;
        Iterator it = defaultEmojiCompatConfigHelper.c(packageManager, intent).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfoA = null;
                break;
            }
            providerInfoA = defaultEmojiCompatConfigHelper.a((ResolveInfo) it.next());
            if (providerInfoA != null && (applicationInfo = providerInfoA.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfoA == null) {
            fontRequest = null;
        } else {
            try {
                String str = providerInfoA.authority;
                String str2 = providerInfoA.packageName;
                Signature[] signatureArrB = defaultEmojiCompatConfigHelper.b(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrB) {
                    arrayList.add(signature.toByteArray());
                }
                fontRequest = new FontRequest(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                fontRequest = null;
            }
        }
        if (fontRequest == null) {
            return null;
        }
        return new FontRequestEmojiCompatConfig(new FontRequestEmojiCompatConfig.FontRequestMetadataLoader(context, fontRequest));
    }
}
