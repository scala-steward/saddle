package org.saddle.macros

import org.saddle.ops._
import org.saddle.ops.macroImpl.BinOpMatMacros.{
  matScalarElementwiseIP => MatSclrIP
}
import org.saddle.Mat

trait BinOpMatInPlace {

  // basic operations
  implicit val matSclr_DD_Add: BinOpInPlace[Add, Mat[Double], Double] = MatSclrIP[Double, Double, Add]
  implicit val matSclr_DL_Add: BinOpInPlace[Add, Mat[Double], Long] = MatSclrIP[Double, Long, Add]
  implicit val matSclr_DI_Add: BinOpInPlace[Add, Mat[Double], Int] = MatSclrIP[Double, Int, Add]
  implicit val matSclr_LL_Add: BinOpInPlace[Add, Mat[Long], Long] = MatSclrIP[Long, Long, Add]
  implicit val matSclr_LI_Add: BinOpInPlace[Add, Mat[Long], Int] = MatSclrIP[Long, Int, Add]
  implicit val matSclr_II_Add: BinOpInPlace[Add, Mat[Int], Int] = MatSclrIP[Int, Int, Add]

  implicit val matSclr_DD_Power: BinOpInPlace[Power, Mat[Double], Double] = MatSclrIP[Double, Double, Power]
  @scala.annotation.nowarn
  implicit val matSclr_DL_Power: BinOpInPlace[Power, Mat[Double], Long] = MatSclrIP[Double, Long, Power]
  implicit val matSclr_DI_Power: BinOpInPlace[Power, Mat[Double], Int] = MatSclrIP[Double, Int, Power]
  @scala.annotation.nowarn
  implicit val matSclr_LL_Power: BinOpInPlace[Power, Mat[Long], Long] = MatSclrIP[Long, Long, Power]
  @scala.annotation.nowarn
  implicit val matSclr_LI_Power: BinOpInPlace[Power, Mat[Long], Int] = MatSclrIP[Long, Int, Power]
  implicit val matSclr_II_Power: BinOpInPlace[Power, Mat[Int], Int] = MatSclrIP[Int, Int, Power]

  implicit val matSclr_DD_Sub: BinOpInPlace[Subtract, Mat[Double], Double] = MatSclrIP[Double, Double, Subtract]
  implicit val matSclr_DL_Sub: BinOpInPlace[Subtract, Mat[Double], Long] = MatSclrIP[Double, Long, Subtract]
  implicit val matSclr_DI_Sub: BinOpInPlace[Subtract, Mat[Double], Int] = MatSclrIP[Double, Int, Subtract]
  implicit val matSclr_LL_Sub: BinOpInPlace[Subtract, Mat[Long], Long] = MatSclrIP[Long, Long, Subtract]
  implicit val matSclr_LI_Sub: BinOpInPlace[Subtract, Mat[Long], Int] = MatSclrIP[Long, Int, Subtract]
  implicit val matSclr_II_Sub: BinOpInPlace[Subtract, Mat[Int], Int] = MatSclrIP[Int, Int, Subtract]

  implicit val matSclr_DD_Mult: BinOpInPlace[Multiply, Mat[Double], Double] = MatSclrIP[Double, Double, Multiply]
  implicit val matSclr_DL_Mult: BinOpInPlace[Multiply, Mat[Double], Long] = MatSclrIP[Double, Long, Multiply]
  implicit val matSclr_DI_Mult: BinOpInPlace[Multiply, Mat[Double], Int] = MatSclrIP[Double, Int, Multiply]
  implicit val matSclr_LL_Mult: BinOpInPlace[Multiply, Mat[Long], Long] = MatSclrIP[Long, Long, Multiply]
  implicit val matSclr_LI_Mult: BinOpInPlace[Multiply, Mat[Long], Int] = MatSclrIP[Long, Int, Multiply]
  implicit val matSclr_II_Mult: BinOpInPlace[Multiply, Mat[Int], Int] = MatSclrIP[Int, Int, Multiply]

  implicit val matSclr_DD_Div: BinOpInPlace[Divide, Mat[Double], Double] = MatSclrIP[Double, Double, Divide]
  implicit val matSclr_DL_Div: BinOpInPlace[Divide, Mat[Double], Long] = MatSclrIP[Double, Long, Divide]
  implicit val matSclr_DI_Div: BinOpInPlace[Divide, Mat[Double], Int] = MatSclrIP[Double, Int, Divide]
  implicit val matSclr_LL_Div: BinOpInPlace[Divide, Mat[Long], Long] = MatSclrIP[Long, Long, Divide]
  implicit val matSclr_LI_Div: BinOpInPlace[Divide, Mat[Long], Int] = MatSclrIP[Long, Int, Divide]
  implicit val matSclr_II_Div: BinOpInPlace[Divide, Mat[Int], Int] = MatSclrIP[Int, Int, Divide]

  implicit val matSclr_DD_Mod: BinOpInPlace[Mod, Mat[Double], Double] = MatSclrIP[Double, Double, Mod]
  implicit val matSclr_DL_Mod: BinOpInPlace[Mod, Mat[Double], Long] = MatSclrIP[Double, Long, Mod]
  implicit val matSclr_DI_Mod: BinOpInPlace[Mod, Mat[Double], Int] = MatSclrIP[Double, Int, Mod]
  implicit val matSclr_LL_Mod: BinOpInPlace[Mod, Mat[Long], Long] = MatSclrIP[Long, Long, Mod]
  implicit val matSclr_LI_Mod: BinOpInPlace[Mod, Mat[Long], Int] = MatSclrIP[Long, Int, Mod]
  implicit val matSclr_II_Mod: BinOpInPlace[Mod, Mat[Int], Int] = MatSclrIP[Int, Int, Mod]

  // bitwise

  implicit val matSclr_LL_BitAnd: BinOpInPlace[BitAnd, Mat[Long], Long] = MatSclrIP[Long, Long, BitAnd]
  implicit val matSclr_LI_BitAnd: BinOpInPlace[BitAnd, Mat[Long], Int] = MatSclrIP[Long, Int, BitAnd]
  implicit val matSclr_II_BitAnd: BinOpInPlace[BitAnd, Mat[Int], Int] = MatSclrIP[Int, Int, BitAnd]

  implicit val matSclr_LL_BitOr: BinOpInPlace[BitOr, Mat[Long], Long] = MatSclrIP[Long, Long, BitOr]
  implicit val matSclr_LI_BitOr: BinOpInPlace[BitOr, Mat[Long], Int] = MatSclrIP[Long, Int, BitOr]
  implicit val matSclr_II_BitOr: BinOpInPlace[BitOr, Mat[Int], Int] = MatSclrIP[Int, Int, BitOr]

  implicit val matSclr_LL_BitXor: BinOpInPlace[BitXor, Mat[Long], Long] = MatSclrIP[Long, Long, BitXor]
  implicit val matSclr_LI_BitXor: BinOpInPlace[BitXor, Mat[Long], Int] = MatSclrIP[Long, Int, BitXor]
  implicit val matSclr_II_BitXor: BinOpInPlace[BitXor, Mat[Int], Int] = MatSclrIP[Int, Int, BitXor]

  implicit val matSclr_LL_BitShl: BinOpInPlace[BitShl, Mat[Long], Long] = MatSclrIP[Long, Long, BitShl]
  implicit val matSclr_LI_BitShl: BinOpInPlace[BitShl, Mat[Long], Int] = MatSclrIP[Long, Int, BitShl]
  implicit val matSclr_II_BitShl: BinOpInPlace[BitShl, Mat[Int], Int] = MatSclrIP[Int, Int, BitShl]

  implicit val matSclr_LL_BitShr: BinOpInPlace[BitShr, Mat[Long], Long] = MatSclrIP[Long, Long, BitShr]
  implicit val matSclr_LI_BitShr: BinOpInPlace[BitShr, Mat[Long], Int] = MatSclrIP[Long, Int, BitShr]
  implicit val matSclr_II_BitShr: BinOpInPlace[BitShr, Mat[Int], Int] = MatSclrIP[Int, Int, BitShr]

  implicit val matSclr_LL_BitUshr: BinOpInPlace[BitUShr, Mat[Long], Long] = MatSclrIP[Long, Long, BitUShr]
  implicit val matSclr_LI_BitUshr: BinOpInPlace[BitUShr, Mat[Long], Int] = MatSclrIP[Long, Int, BitUShr]
  implicit val matSclr_II_BitUshr: BinOpInPlace[BitUShr, Mat[Int], Int] = MatSclrIP[Int, Int, BitUShr]

  // comparison

  implicit val matSclr_BB_GT: BinOpInPlace[GtOp, Mat[Boolean], Boolean] = MatSclrIP[Boolean, Boolean, GtOp]

  implicit val matSclr_BB_GTE: BinOpInPlace[GteOp, Mat[Boolean], Boolean] = MatSclrIP[Boolean, Boolean, GteOp]

  implicit val matSclr_BB_LT: BinOpInPlace[LtOp, Mat[Boolean], Boolean] = MatSclrIP[Boolean, Boolean, LtOp]

  implicit val matSclr_BB_LTE: BinOpInPlace[LteOp, Mat[Boolean], Boolean] = MatSclrIP[Boolean, Boolean, LteOp]

  implicit val matSclr_BB_NEQ: BinOpInPlace[NeqOp, Mat[Boolean], Boolean] = MatSclrIP[Boolean, Boolean, NeqOp]

  implicit val matSclr_BB_EQ: BinOpInPlace[EqOp, Mat[Boolean], Boolean] = MatSclrIP[Boolean, Boolean, EqOp]

  // Bool
  implicit val matSclr_BB_And: BinOpInPlace[AndOp, Mat[Boolean], Boolean] = MatSclrIP[Boolean, Boolean, AndOp]
  implicit val matSclr_BB_Or: BinOpInPlace[OrOp, Mat[Boolean], Boolean] = MatSclrIP[Boolean, Boolean, OrOp]
  implicit val matSclr_BB_Xor: BinOpInPlace[XorOp, Mat[Boolean], Boolean] = MatSclrIP[Boolean, Boolean, XorOp]

}
