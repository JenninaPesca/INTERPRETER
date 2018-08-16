package interpreter.visitors.evaluation;

import interpreter.environments.EnvironmentException;
import interpreter.environments.GenEnvironment;
import interpreter.parser.ast.Exp;
import interpreter.parser.ast.ExpSeq;
import interpreter.parser.ast.Ident;
import interpreter.parser.ast.SimpleIdent;
import interpreter.parser.ast.Stmt;
import interpreter.parser.ast.StmtSeq;
import interpreter.visitors.Visitor;

public class Eval implements Visitor<Value> {

	private final GenEnvironment<Value> env = new GenEnvironment<>();

	// dynamic semantics for programs; no value returned by the visitor

	@Override
	public Value visitProg(StmtSeq stmtSeq) {
		try {
			stmtSeq.accept(this);
		} catch (EnvironmentException e) { // undefined variable
			throw new EvaluatorException(e);
		}
		return null;
	}

	// dynamic semantics for statements; no value returned by the visitor

	@Override
	public Value visitAssignStmt(Ident ident, Exp exp) {
		// to be modified/completed
		return null;
	}

	@Override
	public Value visitForEachStmt(Ident ident, Exp exp, StmtSeq block) {
		// to be modified/completed
		return null;
	}

	@Override
	public Value visitPrintStmt(Exp exp) {
		// to be modified/completed
		return null;
	}

	@Override
	public Value visitVarStmt(Ident ident, Exp exp) {
		// to be modified/completed
		return null;
	}

	// dynamic semantics for sequences of statements
	// no value returned by the visitor

	@Override
	public Value visitSingleStmt(Stmt stmt) {
		// to be modified/completed
		return null;
	}

	@Override
	public Value visitMoreStmt(Stmt first, StmtSeq rest) {
		// to be modified/completed
		return null;
	}

	// dynamic semantics of expressions; a value is returned by the visitor

	@Override
	public Value visitAdd(Exp left, Exp right) {
		// to be modified/completed
		return null;
	}

	@Override
	public Value visitIntLiteral(int value) {
		// to be modified/completed
		return null;
	}

	@Override
	public Value visitListLiteral(ExpSeq exps) {
		// to be modified/completed
		return null;
	}

	@Override
	public Value visitMul(Exp left, Exp right) {
		// to be modified/completed
		return null;
	}

	@Override
	public Value visitPrefix(Exp left, Exp right) {
		// to be modified/completed
		return null;
	}

	@Override
	public Value visitSign(Exp exp) {
		// to be modified/completed
		return null;
	}

	@Override
	public Value visitIdent(String name) {
		// to be modified/completed
		return null;
	}

	// dynamic semantics of sequences of expressions
	// a list of values is returned by the visitor

	@Override
	public Value visitSingleExp(Exp exp) {
		// to be modified/completed
		return null;
	}

	@Override
	public Value visitMoreExp(Exp first, ExpSeq rest) {
		// to be modified/completed
		return null;
	}

}
