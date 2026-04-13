package org.saddle.macros

import org.saddle.ops._
import org.saddle.ops.macroImpl.BinOpVecMacros.{vecVec => make}
import org.saddle.Vec 

trait BinOpVecVecCopy {

  // basic operations
  implicit val vecVec_Copy_DD_Add: BinOp[Add, Vec[Double], Vec[Double], Vec[Double]] = make[Double, Double, Double, Add]
  implicit val vecVec_Copy_LD_Add: BinOp[Add, Vec[Long], Vec[Double], Vec[Double]] = make[Long, Double, Double, Add]
  implicit val vecVec_Copy_DL_Add: BinOp[Add, Vec[Double], Vec[Long], Vec[Double]] = make[Double, Long, Double, Add]
  implicit val vecVec_Copy_DI_Add: BinOp[Add, Vec[Double], Vec[Int], Vec[Double]] = make[Double, Int, Double, Add]
  implicit val vecVec_Copy_ID_Add: BinOp[Add, Vec[Int], Vec[Double], Vec[Double]] = make[Int, Double, Double, Add]
  implicit val vecVec_Copy_LL_Add: BinOp[Add, Vec[Long], Vec[Long], Vec[Long]] = make[Long, Long, Long, Add]
  implicit val vecVec_Copy_LI_Add: BinOp[Add, Vec[Long], Vec[Int], Vec[Long]] = make[Long, Int, Long, Add]
  implicit val vecVec_Copy_IL_Add: BinOp[Add, Vec[Int], Vec[Long], Vec[Long]] = make[Int, Long, Long, Add]
  implicit val vecVec_Copy_II_Add: BinOp[Add, Vec[Int], Vec[Int], Vec[Int]] = make[Int, Int, Int, Add]

  implicit val vecVec_Copy_DD_Power: BinOp[Power, Vec[Double], Vec[Double], Vec[Double]] = make[Double, Double, Double, Power]
  @scala.annotation.nowarn
  implicit val vecVec_Copy_LD_Power: BinOp[Power, Vec[Long], Vec[Double], Vec[Double]] = make[Long, Double, Double, Power]
  @scala.annotation.nowarn
  implicit val vecVec_Copy_DL_Power: BinOp[Power, Vec[Double], Vec[Long], Vec[Double]] = make[Double, Long, Double, Power]
  implicit val vecVec_Copy_DI_Power: BinOp[Power, Vec[Double], Vec[Int], Vec[Double]] = make[Double, Int, Double, Power]
  implicit val vecVec_Copy_ID_Power: BinOp[Power, Vec[Int], Vec[Double], Vec[Double]] = make[Int, Double, Double, Power]
  @scala.annotation.nowarn
  implicit val vecVec_Copy_LL_Power: BinOp[Power, Vec[Long], Vec[Long], Vec[Long]] = make[Long, Long, Long, Power]
  @scala.annotation.nowarn
  implicit val vecVec_Copy_LI_Power: BinOp[Power, Vec[Long], Vec[Int], Vec[Long]] = make[Long, Int, Long, Power]
  @scala.annotation.nowarn
  implicit val vecVec_Copy_IL_Power: BinOp[Power, Vec[Int], Vec[Long], Vec[Long]] = make[Int, Long, Long, Power]
  implicit val vecVec_Copy_II_Power: BinOp[Power, Vec[Int], Vec[Int], Vec[Int]] = make[Int, Int, Int, Power]

  implicit val vecVec_Copy_DD_Sub: BinOp[Subtract, Vec[Double], Vec[Double], Vec[Double]] = make[Double, Double, Double, Subtract]
  implicit val vecVec_Copy_LD_Sub: BinOp[Subtract, Vec[Long], Vec[Double], Vec[Double]] = make[Long, Double, Double, Subtract]
  implicit val vecVec_Copy_DL_Sub: BinOp[Subtract, Vec[Double], Vec[Long], Vec[Double]] = make[Double, Long, Double, Subtract]
  implicit val vecVec_Copy_DI_Sub: BinOp[Subtract, Vec[Double], Vec[Int], Vec[Double]] = make[Double, Int, Double, Subtract]
  implicit val vecVec_Copy_ID_Sub: BinOp[Subtract, Vec[Int], Vec[Double], Vec[Double]] = make[Int, Double, Double, Subtract]
  implicit val vecVec_Copy_LL_Sub: BinOp[Subtract, Vec[Long], Vec[Long], Vec[Long]] = make[Long, Long, Long, Subtract]
  implicit val vecVec_Copy_LI_Sub: BinOp[Subtract, Vec[Long], Vec[Int], Vec[Long]] = make[Long, Int, Long, Subtract]
  implicit val vecVec_Copy_IL_Sub: BinOp[Subtract, Vec[Int], Vec[Long], Vec[Long]] = make[Int, Long, Long, Subtract]
  implicit val vecVec_Copy_II_Sub: BinOp[Subtract, Vec[Int], Vec[Int], Vec[Int]] = make[Int, Int, Int, Subtract]

  implicit val vecVec_Copy_DD_Mult: BinOp[Multiply, Vec[Double], Vec[Double], Vec[Double]] = make[Double, Double, Double, Multiply]
  implicit val vecVec_Copy_LD_Mult: BinOp[Multiply, Vec[Long], Vec[Double], Vec[Double]] = make[Long, Double, Double, Multiply]
  implicit val vecVec_Copy_DL_Mult: BinOp[Multiply, Vec[Double], Vec[Long], Vec[Double]] = make[Double, Long, Double, Multiply]
  implicit val vecVec_Copy_DI_Mult: BinOp[Multiply, Vec[Double], Vec[Int], Vec[Double]] = make[Double, Int, Double, Multiply]
  implicit val vecVec_Copy_ID_Mult: BinOp[Multiply, Vec[Int], Vec[Double], Vec[Double]] = make[Int, Double, Double, Multiply]
  implicit val vecVec_Copy_LL_Mult: BinOp[Multiply, Vec[Long], Vec[Long], Vec[Long]] = make[Long, Long, Long, Multiply]
  implicit val vecVec_Copy_LI_Mult: BinOp[Multiply, Vec[Long], Vec[Int], Vec[Long]] = make[Long, Int, Long, Multiply]
  implicit val vecVec_Copy_IL_Mult: BinOp[Multiply, Vec[Int], Vec[Long], Vec[Long]] = make[Int, Long, Long, Multiply]
  implicit val vecVec_Copy_II_Mult: BinOp[Multiply, Vec[Int], Vec[Int], Vec[Int]] = make[Int, Int, Int, Multiply]

  implicit val vecVec_Copy_DD_Div: BinOp[Divide, Vec[Double], Vec[Double], Vec[Double]] = make[Double, Double, Double, Divide]
  implicit val vecVec_Copy_LD_Div: BinOp[Divide, Vec[Long], Vec[Double], Vec[Double]] = make[Long, Double, Double, Divide]
  implicit val vecVec_Copy_DL_Div: BinOp[Divide, Vec[Double], Vec[Long], Vec[Double]] = make[Double, Long, Double, Divide]
  implicit val vecVec_Copy_DI_Div: BinOp[Divide, Vec[Double], Vec[Int], Vec[Double]] = make[Double, Int, Double, Divide]
  implicit val vecVec_Copy_ID_Div: BinOp[Divide, Vec[Int], Vec[Double], Vec[Double]] = make[Int, Double, Double, Divide]
  implicit val vecVec_Copy_LL_Div: BinOp[Divide, Vec[Long], Vec[Long], Vec[Long]] = make[Long, Long, Long, Divide]
  implicit val vecVec_Copy_LI_Div: BinOp[Divide, Vec[Long], Vec[Int], Vec[Long]] = make[Long, Int, Long, Divide]
  implicit val vecVec_Copy_IL_Div: BinOp[Divide, Vec[Int], Vec[Long], Vec[Long]] = make[Int, Long, Long, Divide]
  implicit val vecVec_Copy_II_Div: BinOp[Divide, Vec[Int], Vec[Int], Vec[Int]] = make[Int, Int, Int, Divide]

  implicit val vecVec_Copy_DD_Mod: BinOp[Mod, Vec[Double], Vec[Double], Vec[Double]] = make[Double, Double, Double, Mod]
  implicit val vecVec_Copy_LD_Mod: BinOp[Mod, Vec[Long], Vec[Double], Vec[Double]] = make[Long, Double, Double, Mod]
  implicit val vecVec_Copy_DL_Mod: BinOp[Mod, Vec[Double], Vec[Long], Vec[Double]] = make[Double, Long, Double, Mod]
  implicit val vecVec_Copy_DI_Mod: BinOp[Mod, Vec[Double], Vec[Int], Vec[Double]] = make[Double, Int, Double, Mod]
  implicit val vecVec_Copy_ID_Mod: BinOp[Mod, Vec[Int], Vec[Double], Vec[Double]] = make[Int, Double, Double, Mod]
  implicit val vecVec_Copy_LL_Mod: BinOp[Mod, Vec[Long], Vec[Long], Vec[Long]] = make[Long, Long, Long, Mod]
  implicit val vecVec_Copy_LI_Mod: BinOp[Mod, Vec[Long], Vec[Int], Vec[Long]] = make[Long, Int, Long, Mod]
  implicit val vecVec_Copy_IL_Mod: BinOp[Mod, Vec[Int], Vec[Long], Vec[Long]] = make[Int, Long, Long, Mod]
  implicit val vecVec_Copy_II_Mod: BinOp[Mod, Vec[Int], Vec[Int], Vec[Int]] = make[Int, Int, Int, Mod]

  // bitwise

  implicit val vecVec_Copy_LL_BitAnd: BinOp[BitAnd, Vec[Long], Vec[Long], Vec[Long]] = make[Long, Long, Long, BitAnd]
  implicit val vecVec_Copy_LI_BitAnd: BinOp[BitAnd, Vec[Long], Vec[Int], Vec[Long]] = make[Long, Int, Long, BitAnd]
  implicit val vecVec_Copy_II_BitAnd: BinOp[BitAnd, Vec[Int], Vec[Int], Vec[Int]] = make[Int, Int, Int, BitAnd]

  implicit val vecVec_Copy_LL_BitOr: BinOp[BitOr, Vec[Long], Vec[Long], Vec[Long]] = make[Long, Long, Long, BitOr]
  implicit val vecVec_Copy_LI_BitOr: BinOp[BitOr, Vec[Long], Vec[Int], Vec[Long]] = make[Long, Int, Long, BitOr]
  implicit val vecVec_Copy_II_BitOr: BinOp[BitOr, Vec[Int], Vec[Int], Vec[Int]] = make[Int, Int, Int, BitOr]

  implicit val vecVec_Copy_LL_BitXor: BinOp[BitXor, Vec[Long], Vec[Long], Vec[Long]] = make[Long, Long, Long, BitXor]
  implicit val vecVec_Copy_LI_BitXor: BinOp[BitXor, Vec[Long], Vec[Int], Vec[Long]] = make[Long, Int, Long, BitXor]
  implicit val vecVec_Copy_II_BitXor: BinOp[BitXor, Vec[Int], Vec[Int], Vec[Int]] = make[Int, Int, Int, BitXor]

  implicit val vecVec_Copy_LL_BitShl: BinOp[BitShl, Vec[Long], Vec[Long], Vec[Long]] = make[Long, Long, Long, BitShl]
  implicit val vecVec_Copy_LI_BitShl: BinOp[BitShl, Vec[Long], Vec[Int], Vec[Long]] = make[Long, Int, Long, BitShl]
  implicit val vecVec_Copy_II_BitShl: BinOp[BitShl, Vec[Int], Vec[Int], Vec[Int]] = make[Int, Int, Int, BitShl]

  implicit val vecVec_Copy_LL_BitShr: BinOp[BitShr, Vec[Long], Vec[Long], Vec[Long]] = make[Long, Long, Long, BitShr]
  implicit val vecVec_Copy_LI_BitShr: BinOp[BitShr, Vec[Long], Vec[Int], Vec[Long]] = make[Long, Int, Long, BitShr]
  implicit val vecVec_Copy_II_BitShr: BinOp[BitShr, Vec[Int], Vec[Int], Vec[Int]] = make[Int, Int, Int, BitShr]

  implicit val vecVec_Copy_LL_BitUshr: BinOp[BitUShr, Vec[Long], Vec[Long], Vec[Long]] = make[Long, Long, Long, BitUShr]
  implicit val vecVec_Copy_LI_BitUshr: BinOp[BitUShr, Vec[Long], Vec[Int], Vec[Long]] = make[Long, Int, Long, BitUShr]
  implicit val vecVec_Copy_II_BitUshr: BinOp[BitUShr, Vec[Int], Vec[Int], Vec[Int]] = make[Int, Int, Int, BitUShr]

  // Boolean
  implicit val vecVec_Copy_BB_And: BinOp[AndOp, Vec[Boolean], Vec[Boolean], Vec[Boolean]] = make[Boolean, Boolean, Boolean, AndOp]
  implicit val vecVec_Copy_BB_Or: BinOp[OrOp, Vec[Boolean], Vec[Boolean], Vec[Boolean]] = make[Boolean, Boolean, Boolean, OrOp]
  implicit val vecVec_Copy_BB_Xor: BinOp[XorOp, Vec[Boolean], Vec[Boolean], Vec[Boolean]] = make[Boolean, Boolean, Boolean, XorOp]
}
