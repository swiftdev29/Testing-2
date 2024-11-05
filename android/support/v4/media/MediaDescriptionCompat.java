package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f58a;

    /* renamed from: b  reason: collision with root package name */
    private final CharSequence f59b;

    /* renamed from: c  reason: collision with root package name */
    private final CharSequence f60c;

    /* renamed from: d  reason: collision with root package name */
    private final CharSequence f61d;

    /* renamed from: e  reason: collision with root package name */
    private final Bitmap f62e;

    /* renamed from: f  reason: collision with root package name */
    private final Uri f63f;

    /* renamed from: q  reason: collision with root package name */
    private final Bundle f64q;

    /* renamed from: r  reason: collision with root package name */
    private final Uri f65r;

    /* renamed from: s  reason: collision with root package name */
    private MediaDescription f66s;

    static class a implements Parcelable.Creator<MediaDescriptionCompat> {
        a() {
        }

        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public MediaDescriptionCompat[] newArray(int i10) {
            return new MediaDescriptionCompat[i10];
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private String f67a;

        /* renamed from: b  reason: collision with root package name */
        private CharSequence f68b;

        /* renamed from: c  reason: collision with root package name */
        private CharSequence f69c;

        /* renamed from: d  reason: collision with root package name */
        private CharSequence f70d;

        /* renamed from: e  reason: collision with root package name */
        private Bitmap f71e;

        /* renamed from: f  reason: collision with root package name */
        private Uri f72f;

        /* renamed from: g  reason: collision with root package name */
        private Bundle f73g;

        /* renamed from: h  reason: collision with root package name */
        private Uri f74h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f67a, this.f68b, this.f69c, this.f70d, this.f71e, this.f72f, this.f73g, this.f74h);
        }

        public b b(CharSequence charSequence) {
            this.f70d = charSequence;
            return this;
        }

        public b c(Bundle bundle) {
            this.f73g = bundle;
            return this;
        }

        public b d(Bitmap bitmap) {
            this.f71e = bitmap;
            return this;
        }

        public b e(Uri uri) {
            this.f72f = uri;
            return this;
        }

        public b f(String str) {
            this.f67a = str;
            return this;
        }

        public b g(Uri uri) {
            this.f74h = uri;
            return this;
        }

        public b h(CharSequence charSequence) {
            this.f69c = charSequence;
            return this;
        }

        public b i(CharSequence charSequence) {
            this.f68b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f58a = str;
        this.f59b = charSequence;
        this.f60c = charSequence2;
        this.f61d = charSequence3;
        this.f62e = bitmap;
        this.f63f = uri;
        this.f64q = bundle;
        this.f65r = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x0076
            android.support.v4.media.MediaDescriptionCompat$b r1 = new android.support.v4.media.MediaDescriptionCompat$b
            r1.<init>()
            android.media.MediaDescription r8 = (android.media.MediaDescription) r8
            java.lang.String r2 = r8.getMediaId()
            r1.f(r2)
            java.lang.CharSequence r2 = r8.getTitle()
            r1.i(r2)
            java.lang.CharSequence r2 = r8.getSubtitle()
            r1.h(r2)
            java.lang.CharSequence r2 = r8.getDescription()
            r1.b(r2)
            android.graphics.Bitmap r2 = r8.getIconBitmap()
            r1.d(r2)
            android.net.Uri r2 = r8.getIconUri()
            r1.e(r2)
            android.os.Bundle r2 = r8.getExtras()
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L_0x0046
            android.support.v4.media.session.MediaSessionCompat.a(r2)
            android.os.Parcelable r4 = r2.getParcelable(r3)
            android.net.Uri r4 = (android.net.Uri) r4
            goto L_0x0047
        L_0x0046:
            r4 = r0
        L_0x0047:
            if (r4 == 0) goto L_0x005f
            java.lang.String r5 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r6 = r2.containsKey(r5)
            if (r6 == 0) goto L_0x0059
            int r6 = r2.size()
            r7 = 2
            if (r6 != r7) goto L_0x0059
            goto L_0x0060
        L_0x0059:
            r2.remove(r3)
            r2.remove(r5)
        L_0x005f:
            r0 = r2
        L_0x0060:
            r1.c(r0)
            if (r4 == 0) goto L_0x0069
            r1.g(r4)
            goto L_0x0070
        L_0x0069:
            android.net.Uri r0 = r8.getMediaUri()
            r1.g(r0)
        L_0x0070:
            android.support.v4.media.MediaDescriptionCompat r0 = r1.a()
            r0.f66s = r8
        L_0x0076:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public Object b() {
        MediaDescription mediaDescription = this.f66s;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f58a);
        builder.setTitle(this.f59b);
        builder.setSubtitle(this.f60c);
        builder.setDescription(this.f61d);
        builder.setIconBitmap(this.f62e);
        builder.setIconUri(this.f63f);
        builder.setExtras(this.f64q);
        builder.setMediaUri(this.f65r);
        MediaDescription build = builder.build();
        this.f66s = build;
        return build;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f59b + ", " + this.f60c + ", " + this.f61d;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        ((MediaDescription) b()).writeToParcel(parcel, i10);
    }
}
