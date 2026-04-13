package org.saddle.macros

import org.saddle.Mat
import org.saddle.ops._
import org.saddle.ops.macroImpl.BinOpMatMacros.{matMat => MatMat}


trait BinOpMatMatCopy {

  // basic operations
  implicit val matMat_Copy_DD_Add: BinOp[Add, Mat[Double], Mat[Double], Mat[Double]] = MatMat[Double, Double, Double, Add]
  implicit val matMat_Copy_LD_Add: BinOp[Add, Mat[Long], Mat[Double], Mat[Double]] = MatMat[Long, Double, Double, Add]
  implicit val matMat_Copy_DL_Add: BinOp[Add, Mat[Double], Mat[Long], Mat[Double]] = MatMat[Double, Long, Double, Add]
  implicit val matMat_Copy_DI_Add: BinOp[Add, Mat[Double], Mat[Int], Mat[Double]] = MatMat[Double, Int, Double, Add]
  implicit val matMat_Copy_ID_Add: BinOp[Add, Mat[Int], Mat[Double], Mat[Double]] = MatMat[Int, Double, Double, Add]
  implicit val matMat_Copy_LL_Add: BinOp[Add, Mat[Long], Mat[Long], Mat[Long]] = MatMat[Long, Long, Long, Add]
  implicit val matMat_Copy_LI_Add: BinOp[Add, Mat[Long], Mat[Int], Mat[Long]] = MatMat[Long, Int, Long, Add]
  implicit val matMat_Copy_IL_Add: BinOp[Add, Mat[Int], Mat[Long], Mat[Long]] = MatMat[Int, Long, Long, Add]
  implicit val matMat_Copy_II_Add: BinOp[Add, Mat[Int], Mat[Int], Mat[Int]] = MatMat[Int, Int, Int, Add]

  implicit val matMat_Copy_DD_Power: BinOp[Power, Mat[Double], Mat[Double], Mat[Double]] = MatMat[Double, Double, Double, Power]
  @scala.annotation.nowarn
  implicit val matMat_Copy_LD_Power: BinOp[Power, Mat[Long], Mat[Double], Mat[Double]] = MatMat[Long, Double, Double, Power]
  @scala.annotation.nowarn
  implicit val matMat_Copy_DL_Power: BinOp[Power, Mat[Double], Mat[Long], Mat[Double]] = MatMat[Double, Long, Double, Power]
  implicit val matMat_Copy_DI_Power: BinOp[Power, Mat[Double], Mat[Int], Mat[Double]] = MatMat[Double, Int, Double, Power]
  implicit val matMat_Copy_ID_Power: BinOp[Power, Mat[Int], Mat[Double], Mat[Double]] = MatMat[Int, Double, Double, Power]
  @scala.annotation.nowarn
  implicit val matMat_Copy_LL_Power: BinOp[Power, Mat[Long], Mat[Long], Mat[Long]] = MatMat[Long, Long, Long, Power]
  @scala.annotation.nowarn
  implicit val matMat_Copy_LI_Power: BinOp[Power, Mat[Long], Mat[Int], Mat[Long]] = MatMat[Long, Int, Long, Power]
  @scala.annotation.nowarn
  implicit val matMat_Copy_IL_Power: BinOp[Power, Mat[Int], Mat[Long], Mat[Long]] = MatMat[Int, Long, Long, Power]
  implicit val matMat_Copy_II_Power: BinOp[Power, Mat[Int], Mat[Int], Mat[Int]] = MatMat[Int, Int, Int, Power]

  implicit val matMat_Copy_DD_Sub: BinOp[Subtract, Mat[Double], Mat[Double], Mat[Double]] = MatMat[Double, Double, Double, Subtract]
  implicit val matMat_Copy_LD_Sub: BinOp[Subtract, Mat[Long], Mat[Double], Mat[Double]] = MatMat[Long, Double, Double, Subtract]
  implicit val matMat_Copy_DL_Sub: BinOp[Subtract, Mat[Double], Mat[Long], Mat[Double]] = MatMat[Double, Long, Double, Subtract]
  implicit val matMat_Copy_DI_Sub: BinOp[Subtract, Mat[Double], Mat[Int], Mat[Double]] = MatMat[Double, Int, Double, Subtract]
  implicit val matMat_Copy_ID_Sub: BinOp[Subtract, Mat[Int], Mat[Double], Mat[Double]] = MatMat[Int, Double, Double, Subtract]
  implicit val matMat_Copy_LL_Sub: BinOp[Subtract, Mat[Long], Mat[Long], Mat[Long]] = MatMat[Long, Long, Long, Subtract]
  implicit val matMat_Copy_LI_Sub: BinOp[Subtract, Mat[Long], Mat[Int], Mat[Long]] = MatMat[Long, Int, Long, Subtract]
  implicit val matMat_Copy_IL_Sub: BinOp[Subtract, Mat[Int], Mat[Long], Mat[Long]] = MatMat[Int, Long, Long, Subtract]
  implicit val matMat_Copy_II_Sub: BinOp[Subtract, Mat[Int], Mat[Int], Mat[Int]] = MatMat[Int, Int, Int, Subtract]

  implicit val matMat_Copy_DD_Mult: BinOp[Multiply, Mat[Double], Mat[Double], Mat[Double]] = MatMat[Double, Double, Double, Multiply]
  implicit val matMat_Copy_LD_Mult: BinOp[Multiply, Mat[Long], Mat[Double], Mat[Double]] = MatMat[Long, Double, Double, Multiply]
  implicit val matMat_Copy_DL_Mult: BinOp[Multiply, Mat[Double], Mat[Long], Mat[Double]] = MatMat[Double, Long, Double, Multiply]
  implicit val matMat_Copy_DI_Mult: BinOp[Multiply, Mat[Double], Mat[Int], Mat[Double]] = MatMat[Double, Int, Double, Multiply]
  implicit val matMat_Copy_ID_Mult: BinOp[Multiply, Mat[Int], Mat[Double], Mat[Double]] = MatMat[Int, Double, Double, Multiply]
  implicit val matMat_Copy_LL_Mult: BinOp[Multiply, Mat[Long], Mat[Long], Mat[Long]] = MatMat[Long, Long, Long, Multiply]
  implicit val matMat_Copy_LI_Mult: BinOp[Multiply, Mat[Long], Mat[Int], Mat[Long]] = MatMat[Long, Int, Long, Multiply]
  implicit val matMat_Copy_IL_Mult: BinOp[Multiply, Mat[Int], Mat[Long], Mat[Long]] = MatMat[Int, Long, Long, Multiply]
  implicit val matMat_Copy_II_Mult: BinOp[Multiply, Mat[Int], Mat[Int], Mat[Int]] = MatMat[Int, Int, Int, Multiply]

  implicit val matMat_Copy_DD_Div: BinOp[Divide, Mat[Double], Mat[Double], Mat[Double]] = MatMat[Double, Double, Double, Divide]
  implicit val matMat_Copy_LD_Div: BinOp[Divide, Mat[Long], Mat[Double], Mat[Double]] = MatMat[Long, Double, Double, Divide]
  implicit val matMat_Copy_DL_Div: BinOp[Divide, Mat[Double], Mat[Long], Mat[Double]] = MatMat[Double, Long, Double, Divide]
  implicit val matMat_Copy_DI_Div: BinOp[Divide, Mat[Double], Mat[Int], Mat[Double]] = MatMat[Double, Int, Double, Divide]
  implicit val matMat_Copy_ID_Div: BinOp[Divide, Mat[Int], Mat[Double], Mat[Double]] = MatMat[Int, Double, Double, Divide]
  implicit val matMat_Copy_LL_Div: BinOp[Divide, Mat[Long], Mat[Long], Mat[Long]] = MatMat[Long, Long, Long, Divide]
  implicit val matMat_Copy_LI_Div: BinOp[Divide, Mat[Long], Mat[Int], Mat[Long]] = MatMat[Long, Int, Long, Divide]
  implicit val matMat_Copy_IL_Div: BinOp[Divide, Mat[Int], Mat[Long], Mat[Long]] = MatMat[Int, Long, Long, Divide]
  implicit val matMat_Copy_II_Div: BinOp[Divide, Mat[Int], Mat[Int], Mat[Int]] = MatMat[Int, Int, Int, Divide]

  implicit val matMat_Copy_DD_Mod: BinOp[Mod, Mat[Double], Mat[Double], Mat[Double]] = MatMat[Double, Double, Double, Mod]
  implicit val matMat_Copy_LD_Mod: BinOp[Mod, Mat[Long], Mat[Double], Mat[Double]] = MatMat[Long, Double, Double, Mod]
  implicit val matMat_Copy_DL_Mod: BinOp[Mod, Mat[Double], Mat[Long], Mat[Double]] = MatMat[Double, Long, Double, Mod]
  implicit val matMat_Copy_DI_Mod: BinOp[Mod, Mat[Double], Mat[Int], Mat[Double]] = MatMat[Double, Int, Double, Mod]
  implicit val matMat_Copy_ID_Mod: BinOp[Mod, Mat[Int], Mat[Double], Mat[Double]] = MatMat[Int, Double, Double, Mod]
  implicit val matMat_Copy_LL_Mod: BinOp[Mod, Mat[Long], Mat[Long], Mat[Long]] = MatMat[Long, Long, Long, Mod]
  implicit val matMat_Copy_LI_Mod: BinOp[Mod, Mat[Long], Mat[Int], Mat[Long]] = MatMat[Long, Int, Long, Mod]
  implicit val matMat_Copy_IL_Mod: BinOp[Mod, Mat[Int], Mat[Long], Mat[Long]] = MatMat[Int, Long, Long, Mod]
  implicit val matMat_Copy_II_Mod: BinOp[Mod, Mat[Int], Mat[Int], Mat[Int]] = MatMat[Int, Int, Int, Mod]

  // bitwise

  implicit val matMat_Copy_LL_BitAnd: BinOp[BitAnd, Mat[Long], Mat[Long], Mat[Long]] = MatMat[Long, Long, Long, BitAnd]
  implicit val matMat_Copy_LI_BitAnd: BinOp[BitAnd, Mat[Long], Mat[Int], Mat[Long]] = MatMat[Long, Int, Long, BitAnd]
  implicit val matMat_Copy_II_BitAnd: BinOp[BitAnd, Mat[Int], Mat[Int], Mat[Int]] = MatMat[Int, Int, Int, BitAnd]

  implicit val matMat_Copy_LL_BitOr: BinOp[BitOr, Mat[Long], Mat[Long], Mat[Long]] = MatMat[Long, Long, Long, BitOr]
  implicit val matMat_Copy_LI_BitOr: BinOp[BitOr, Mat[Long], Mat[Int], Mat[Long]] = MatMat[Long, Int, Long, BitOr]
  implicit val matMat_Copy_II_BitOr: BinOp[BitOr, Mat[Int], Mat[Int], Mat[Int]] = MatMat[Int, Int, Int, BitOr]

  implicit val matMat_Copy_LL_BitXor: BinOp[BitXor, Mat[Long], Mat[Long], Mat[Long]] = MatMat[Long, Long, Long, BitXor]
  implicit val matMat_Copy_LI_BitXor: BinOp[BitXor, Mat[Long], Mat[Int], Mat[Long]] = MatMat[Long, Int, Long, BitXor]
  implicit val matMat_Copy_II_BitXor: BinOp[BitXor, Mat[Int], Mat[Int], Mat[Int]] = MatMat[Int, Int, Int, BitXor]

  implicit val matMat_Copy_LL_BitShl: BinOp[BitShl, Mat[Long], Mat[Long], Mat[Long]] = MatMat[Long, Long, Long, BitShl]
  implicit val matMat_Copy_LI_BitShl: BinOp[BitShl, Mat[Long], Mat[Int], Mat[Long]] = MatMat[Long, Int, Long, BitShl]
  implicit val matMat_Copy_II_BitShl: BinOp[BitShl, Mat[Int], Mat[Int], Mat[Int]] = MatMat[Int, Int, Int, BitShl]

  implicit val matMat_Copy_LL_BitShr: BinOp[BitShr, Mat[Long], Mat[Long], Mat[Long]] = MatMat[Long, Long, Long, BitShr]
  implicit val matMat_Copy_LI_BitShr: BinOp[BitShr, Mat[Long], Mat[Int], Mat[Long]] = MatMat[Long, Int, Long, BitShr]
  implicit val matMat_Copy_II_BitShr: BinOp[BitShr, Mat[Int], Mat[Int], Mat[Int]] = MatMat[Int, Int, Int, BitShr]

  implicit val matMat_Copy_LL_BitUshr: BinOp[BitUShr, Mat[Long], Mat[Long], Mat[Long]] = MatMat[Long, Long, Long, BitUShr]
  implicit val matMat_Copy_LI_BitUshr: BinOp[BitUShr, Mat[Long], Mat[Int], Mat[Long]] = MatMat[Long, Int, Long, BitUShr]
  implicit val matMat_Copy_II_BitUshr: BinOp[BitUShr, Mat[Int], Mat[Int], Mat[Int]] = MatMat[Int, Int, Int, BitUShr]

  // Boolean
  implicit val matMat_Copy_BB_And: BinOp[AndOp, Mat[Boolean], Mat[Boolean], Mat[Boolean]] = MatMat[Boolean, Boolean, Boolean, AndOp]
  implicit val matMat_Copy_BB_Or: BinOp[OrOp, Mat[Boolean], Mat[Boolean], Mat[Boolean]] = MatMat[Boolean, Boolean, Boolean, OrOp]
  implicit val matMat_Copy_BB_Xor: BinOp[XorOp, Mat[Boolean], Mat[Boolean], Mat[Boolean]] = MatMat[Boolean, Boolean, Boolean, XorOp]
}
