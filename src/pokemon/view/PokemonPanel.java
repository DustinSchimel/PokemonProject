package pokemon.view;

import pokemon.controller.PokemonController;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PokemonPanel extends JPanel
{
	private PokemonController appController;
	private SpringLayout appLayout;
	
	private JLabel healthLabel;
	private JLabel attackLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel evolvableLabel;
	private JLabel modifierLabel;
	private JLabel iconLabel;
	
	private JCheckBox evolvableBox;
	private JTextField nameField;
	private JTextField numberField;
	private JTextField attackField;
	private JTextField healthField;
	private JTextField modifierField;
	
	private JTextArea descriptionArea;
	private JTextArea typeArea;
	
	private JButton saveButton;
	private JButton clearButton;
	private JComboBox pokedexDropdown;
	
	private JPanel firstType;
	private JPanel secondType;
	
	public PokemonPanel(PokemonController appController)
	{
		super();
		this.appController = appController;
		
		appLayout = new SpringLayout();
		
		healthLabel = new JLabel("");
		attackLabel = new JLabel("");
		nameLabel = new JLabel("");
		numberLabel = new JLabel("");
		evolvableLabel = new JLabel("");
		modifierLabel = new JLabel("");
		
		iconLabel = new JLabel("", new ImageIcon(getClass().getResource("/pokemon/view/images/logo.png")), JLabel.CENTER);
		
		evolvableBox = new JCheckBox();
		nameField = new JTextField(0);
		numberField = new JTextField(0);
		attackField = new JTextField(0);
		healthField = new JTextField(0);
		modifierField = new JTextField(0);
		
		descriptionArea = new JTextArea(0, 0);
		typeArea = new JTextArea(0, 0);
		
		saveButton = new JButton("Save");
		clearButton = new JButton("Clear");
		pokedexDropdown = new JComboBox();
	
		firstType = new JPanel();
		secondType = new JPanel();
			
		setupPanel();
		setupLayout();
		setupListeners();
		setupComboBox();
		setupTypePanels();
	}
	
	private void setupComboBox()
	{
		DefaultComboBoxModel pokemonModel = new DefaultComboBoxModel(appController.convertPokedex());
		pokedexDropdown.setModel(pokemonModel);
	}
	
	private void setupTypePanels()
	{
		firstType.setSize(50, 50);
		secondType.setSize(50, 50);
	}
	
	private void updateTypePanels()
	{
		String[] types = appController.getPokedex().get(pokedexDropdown.getSelectedIndex()).getPokemonTypes();
		
		if (types[0].equals("Dragon"))
		{
			firstType.setBackground(Color.CYAN);
		}
		else if(types[0].equals("Fire"))
		{
			firstType.setBackground(Color.RED);
		}
		else if(types[0].equals("Dark"))
		{
			firstType.setBackground(Color.BLACK);
		}
		else if(types[0].equals("Ground"))
		{
			firstType.setBackground(Color.YELLOW);
		}
		else
		{
			firstType.setBackground(Color.WHITE);
		}
		
		if (types.length > 1)
			if (types[1].equals("Dragon"))
			{
				secondType.setBackground(Color.CYAN);
			}
			else if (types[1].equals("Fire"))
			{
				secondType.setBackground(Color.RED);
			}
			else if (types[1].equals("Dark"))
			{
				secondType.setBackground(Color.BLACK);
			}
			else if (types[1].equals("Ground"))
			{
				secondType.setBackground(Color.YELLOW);
			}
			else
			{
				secondType.setBackground(Color.WHITE);
			}
		
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.GRAY);
		this.setLayout(appLayout);
		this.add(healthLabel);
		this.add(attackLabel);
		this.add(nameLabel);
		this.add(numberLabel);
		this.add(evolvableLabel);
		this.add(modifierLabel);
		this.add(evolvableBox);
		this.add(nameField);
		this.add(numberField);
		this.add(attackField);
		this.add(healthField);
		this.add(modifierField);
		this.add(descriptionArea);
		this.add(typeArea);
		this.add(saveButton);
		this.add(clearButton);
		this.add(pokedexDropdown);
		this.add(firstType);
		this.add(secondType);
		this.add(iconLabel);
		
	}
	
	public void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.WEST, saveButton, 0, SpringLayout.WEST, healthLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, saveButton, -44, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, clearButton, 5, SpringLayout.SOUTH, saveButton);
		appLayout.putConstraint(SpringLayout.WEST, clearButton, 0, SpringLayout.WEST, healthLabel);
		appLayout.putConstraint(SpringLayout.NORTH, iconLabel, 24, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, iconLabel, 153, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, evolvableBox, -82, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, evolvableBox, 6, SpringLayout.SOUTH, modifierField);
		appLayout.putConstraint(SpringLayout.NORTH, modifierField, 6, SpringLayout.SOUTH, attackField);
		appLayout.putConstraint(SpringLayout.WEST, modifierField, 0, SpringLayout.WEST, nameField);
		appLayout.putConstraint(SpringLayout.NORTH, healthField, 16, SpringLayout.SOUTH, firstType);
		appLayout.putConstraint(SpringLayout.NORTH, firstType, 6, SpringLayout.SOUTH, numberField);
		appLayout.putConstraint(SpringLayout.EAST, firstType, 0, SpringLayout.EAST, nameField);
		appLayout.putConstraint(SpringLayout.NORTH, nameField, -1, SpringLayout.NORTH, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.NORTH, pokedexDropdown, 0, SpringLayout.NORTH, iconLabel);
		appLayout.putConstraint(SpringLayout.WEST, pokedexDropdown, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.WEST, secondType, 31, SpringLayout.EAST, firstType);
		appLayout.putConstraint(SpringLayout.SOUTH, secondType, 0, SpringLayout.SOUTH, firstType);
		appLayout.putConstraint(SpringLayout.NORTH, attackField, 6, SpringLayout.SOUTH, healthField);
		appLayout.putConstraint(SpringLayout.EAST, healthField, 0, SpringLayout.EAST, nameField);
		appLayout.putConstraint(SpringLayout.NORTH, numberField, 6, SpringLayout.SOUTH, nameField);
		appLayout.putConstraint(SpringLayout.EAST, numberField, 0, SpringLayout.EAST, nameField);
		appLayout.putConstraint(SpringLayout.WEST, attackField, 0, SpringLayout.WEST, nameField);
		appLayout.putConstraint(SpringLayout.WEST, nameField, 42, SpringLayout.EAST, iconLabel);
		
	}
	
	private void updatePokedexInfo(int index)
	{
		//Update basic fields
		nameField.setText(appController.getPokedex().get(index).getName());
		evolvableBox.setSelected(appController.getPokedex().get(index).isCanEvolve());
		numberField.setText(appController.getPokedex().get(index).getNumber() + "");
		attackField.setText(appController.getPokedex().get(index).getAttackPoints() + "");
		healthField.setText(appController.getPokedex().get(index).getHealthPoints() + "");
		modifierField.setText(appController.getPokedex().get(index).getEnhancementModifier() + "");
		
		//update Text areas
		descriptionArea.setText(appController.getPokedex().get(index).toString());
		typeArea.setText("");
		
		for (String current : appController.getPokedex().get(index).getPokemonTypes())
		{
			typeArea.append(current+ "\n");
		}
	}
	
	private void updateImage()
	{
		String path = "/pokemon/view/images/";
		String defaultName = "logo";
		String name = pokedexDropdown.getSelectedItem().toString();
		String extension = ".png";
		ImageIcon pokemonIcon;
		
		try
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + name + extension));
		}
		catch (NullPointerException missingImageFile)
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + defaultName + extension));
		}
		
		iconLabel.setIcon(pokemonIcon);
	}
	
	private void setupListeners()
	{
		pokedexDropdown.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				int  selectedPokemonIndex = pokedexDropdown.getSelectedIndex();
				updatePokedexInfo(selectedPokemonIndex);
				updateImage();
				updateTypePanels();
				repaint();
			}
		});
		
	}
	
}