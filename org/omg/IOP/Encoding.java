package org.omg.IOP;


/**
* org/omg/IOP/Encoding.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/jenkins/workspace/8-2-build-windows-x64-cygwin/jdk8u371/3355/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Friday, March 17, 2023 4:05:04 AM UTC
*/

public final class Encoding implements org.omg.CORBA.portable.IDLEntity
{

  /**
     * The encoding format.
     */
  public short format = (short)0;

  /**
     * The major version of this Encoding format.
     */
  public byte major_version = (byte)0;

  /**
     * The minor version of this Encoding format.
     */
  public byte minor_version = (byte)0;

  public Encoding ()
  {
  } // ctor

  public Encoding (short _format, byte _major_version, byte _minor_version)
  {
    format = _format;
    major_version = _major_version;
    minor_version = _minor_version;
  } // ctor

} // class Encoding
