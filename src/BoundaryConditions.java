
public interface BoundaryConditions {

	/**
	 * Return the neighbor of a Cell in a given Generation subject to the 
	 * boundary conditions.
	 * @param cellIdx the index of the Cell
	 * @param offset the index of the neighbor relative to the Cell
	 * @param gen the Generation
	 * @return the Cell with index cellIdx + offset
	 */
	Cell getNeighbor(int cellIdx, int offset, Generation gen);
}
