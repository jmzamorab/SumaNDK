#include <jni.h>
#include <string>

JNIEXPORT jint JNICALL
Java_sumandk_com_sumandk_MainActivity_calcularSuma(JNIEnv *env, jobject instance, jint aux1,
                                                   jint aux2) {

    // TODO

}

extern "C"
JNIEXPORT jstring JNICALL
Java_sumandk_com_sumandk_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
